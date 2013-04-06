package parsers;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import fields.Field;
import fields.f4_1.F4_1AnnualValueEURO;
import fields.f4_1.F4_1Beneficiary;
import fields.f4_1.F4_1GrantName;
import fields.f4_1.F4_1GrantNumber;
import fields.f4_1.F4_1PointsLast3Years;
import fields.f4_1.F4_1PointsTotalActivity;
import fields.f4_1.F4_1ResearchTeam;
import fields.f4_1.F4_1TeamPosition;
import fields.f4_1.F4_1Year;

public class P4_1Parser extends Parser {

	private String fileName;
	private ArrayList<Field> listOfFields;
	private String[] team;

	public P4_1Parser(String fileName) {
		this.fileName = fileName;
		listOfFields = new ArrayList<Field>();
	}

	@Override
	protected ArrayList<Field> parse() throws IOException,
			FileNotFoundException {
		try {
			InputStream io = new FileInputStream(fileName);
			wb = new XSSFWorkbook(io);
			XSSFSheet sheet = wb.getSheet("4.1");
			Row teamPositionRow = sheet.getRow(8);
			Integer nrCrt;
			for (Iterator<Row> it = sheet.rowIterator(); it.hasNext();) {
				Row row = (XSSFRow) it.next();
				for (nrCrt = 1; nrCrt <= sheet.getPhysicalNumberOfRows(); nrCrt++) {
					if (row.getCell('A' - 'A').toString().equals(nrCrt.toString()) && (row.getCell('B' - 'A').getCellType() != Cell.CELL_TYPE_BLANK)) {
						String researchTeam  = computeCell(row.getCell('B' - 'A'));
						team = computeString(researchTeam);
						listOfFields.add(new F4_1ResearchTeam(team));
						String grantName = computeCell(row.getCell('C' - 'A'));
						listOfFields.add(new F4_1GrantName(grantName));
						String grantNumber = computeCell(row.getCell('D' - 'A'));
						listOfFields.add(new F4_1GrantNumber(grantNumber));
						String year = computeCell(row.getCell('E' - 'A'));
						listOfFields.add(new F4_1Year(year));
						String annualValueEURO = computeCell(row.getCell('F' - 'A'));
						listOfFields.add(new F4_1AnnualValueEURO(annualValueEURO));
						String beneficiary = computeCell(row.getCell('G' - 'A'));
						listOfFields.add(new F4_1Beneficiary(beneficiary));
						String teamPosition = "";
						if (row.getCell('H' - 'A').getCellType() != Cell.CELL_TYPE_BLANK) {
							teamPosition = computeCell(teamPositionRow.getCell('H' - 'A'));
						} else if (row.getCell('I' - 'A').getCellType() != Cell.CELL_TYPE_BLANK) {
							teamPosition = computeCell(teamPositionRow.getCell('I' - 'A'));
						} else if (row.getCell('J' - 'A').getCellType() != Cell.CELL_TYPE_BLANK) {
							teamPosition = computeCell(teamPositionRow.getCell('J' - 'A'));
						} else {
							teamPosition = computeCell(teamPositionRow.getCell('K' - 'A'));
						}
						listOfFields.add(new F4_1TeamPosition(teamPosition));
						String pointsLast3Years = computeCell(row.getCell('L' - 'A'));
						listOfFields.add(new F4_1PointsLast3Years(pointsLast3Years));
						String pointsTotalActivity = computeCell(row.getCell('M' - 'A'));
						listOfFields.add(new F4_1PointsTotalActivity(pointsTotalActivity));
					}
				}
				
			}
			io.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return listOfFields;
	}

}
