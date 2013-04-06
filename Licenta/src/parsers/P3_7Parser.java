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
import fields.f3_7.F3_7Authors;
import fields.f3_7.F3_7IdentificationData;
import fields.f3_7.F3_7PatentTitle;
import fields.f3_7.F3_7PatentType;
import fields.f3_7.F3_7PointsLast3Years;
import fields.f3_7.F3_7PointsTotalActivity;
import fields.f3_7.F3_7Year;

public class P3_7Parser extends Parser {

	private String fileName;
	private ArrayList<Field> listOfFields;
	private String[] authorsTeam;
	private String[] identificationData;

	public P3_7Parser(String fileName) {
		this.fileName = fileName;
		listOfFields = new ArrayList<Field>();
	}

	@Override
	protected ArrayList<Field> parse() throws IOException,
			FileNotFoundException {
		try {
			InputStream io = new FileInputStream(fileName);
			wb = new XSSFWorkbook(io);
			XSSFSheet sheet = wb.getSheet("3.7");
			Row patentTypeRow = sheet.getRow(8);
			Integer nrCrt;
			for (Iterator<Row> it = sheet.rowIterator(); it.hasNext();) {
				Row row = (XSSFRow) it.next();
				for (nrCrt = 1; nrCrt <= sheet.getPhysicalNumberOfRows(); nrCrt++) {
					if (row.getCell('A' - 'A').toString().equals(nrCrt.toString()) && (row.getCell('B' - 'A').getCellType() != Cell.CELL_TYPE_BLANK)) {
						String authors  = computeCell(row.getCell('B' - 'A'));
						authorsTeam = computeString(authors);
						listOfFields.add(new F3_7Authors(authorsTeam));
						String patentTitle = computeCell(row.getCell('C' - 'A'));
						listOfFields.add(new F3_7PatentTitle(patentTitle));
						String identification = computeCell(row.getCell('D' - 'A'));
						identificationData = computeString(identification);
						listOfFields.add(new F3_7IdentificationData(identificationData));
						String year = computeCell(row.getCell('E' - 'A'));
						listOfFields.add(new F3_7Year(year));
						String patentType = "";
						if (row.getCell('F' - 'A').getCellType() != Cell.CELL_TYPE_BLANK) {
							patentType = computeCell(patentTypeRow.getCell('F' - 'A'));
						} else if (row.getCell('G' - 'A').getCellType() != Cell.CELL_TYPE_BLANK) {
							patentType = computeCell(patentTypeRow.getCell('G' - 'A'));
						} else {
							patentType = computeCell(patentTypeRow.getCell('H' - 'A'));
						}
						listOfFields.add(new F3_7PatentType(patentType));
						String pointsLast3Years = computeCell(row.getCell('I' - 'A'));
						listOfFields.add(new F3_7PointsLast3Years(pointsLast3Years));
						String pointsTotalActivity = computeCell(row.getCell('J' - 'A'));
						listOfFields.add(new F3_7PointsTotalActivity(pointsTotalActivity));
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
