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
import fields.f4_2a.F4_2aAnnualValueRON;
import fields.f4_2a.F4_2aGrantName;
import fields.f4_2a.F4_2aGrantNumber;
import fields.f4_2a.F4_2aPointsLast3Years;
import fields.f4_2a.F4_2aPointsTotalActivity;
import fields.f4_2a.F4_2aProgramName;
import fields.f4_2a.F4_2aResearchTeam;
import fields.f4_2a.F4_2aTeamPosition;
import fields.f4_2a.F4_2aYear;

public class P4_2aParser extends Parser {

	private String fileName;
	private ArrayList<Field> listOfFields;
	private String[] team;

	public P4_2aParser(String fileName) {
		this.fileName = fileName;
		listOfFields = new ArrayList<Field>();
	}

	@Override
	protected ArrayList<Field> parse() throws IOException,
			FileNotFoundException {
		try {
			InputStream io = new FileInputStream(fileName);
			wb = new XSSFWorkbook(io);
			XSSFSheet sheet = wb.getSheet("4.2a");
			Row teamPositionRow = sheet.getRow(8);
			Integer nrCrt;
			for (Iterator<Row> it = sheet.rowIterator(); it.hasNext();) {
				Row row = (XSSFRow) it.next();
				for (nrCrt = 1; nrCrt <= sheet.getPhysicalNumberOfRows(); nrCrt++) {
					if (row.getCell('A' - 'A').toString().equals(nrCrt.toString()) && (row.getCell('B' - 'A').getCellType() != Cell.CELL_TYPE_BLANK)) {
						String researchTeam  = computeCell(row.getCell('B' - 'A'));
						team = computeString(researchTeam);
						listOfFields.add(new F4_2aResearchTeam(team));
						String grantName = computeCell(row.getCell('C' - 'A'));
						listOfFields.add(new F4_2aGrantName(grantName));
						String programName = computeCell(row.getCell('D' - 'A'));
						listOfFields.add(new F4_2aProgramName(programName));
						String grantNumber = computeCell(row.getCell('E' - 'A'));
						listOfFields.add(new F4_2aGrantNumber(grantNumber));
						String year = computeCell(row.getCell('F' - 'A'));
						listOfFields.add(new F4_2aYear(year));
						String annualValueRON = computeCell(row.getCell('G' - 'A'));
						listOfFields.add(new F4_2aAnnualValueRON(annualValueRON));
						String teamPosition = "";
						if (row.getCell('I' - 'A').getCellType() != Cell.CELL_TYPE_BLANK) {
							teamPosition = computeCell(teamPositionRow.getCell('I' - 'A'));
						} else if (row.getCell('J' - 'A').getCellType() != Cell.CELL_TYPE_BLANK) {
							teamPosition = computeCell(teamPositionRow.getCell('J' - 'A'));
						} else {
							teamPosition = computeCell(teamPositionRow.getCell('K' - 'A'));
						}
						listOfFields.add(new F4_2aTeamPosition(teamPosition));
						String pointsLast3Years = computeCell(row.getCell('L' - 'A'));
						listOfFields.add(new F4_2aPointsLast3Years(pointsLast3Years));
						String pointsTotalActivity = computeCell(row.getCell('M' - 'A'));
						listOfFields.add(new F4_2aPointsTotalActivity(pointsTotalActivity));
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
