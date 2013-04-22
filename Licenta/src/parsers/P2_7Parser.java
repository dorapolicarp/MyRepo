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
import fields.f2_7.F2_7Authors;
import fields.f2_7.F2_7BookTitle;
import fields.f2_7.F2_7MultiplicationDetails;
import fields.f2_7.F2_7OwnPages;
import fields.f2_7.F2_7PointsLast3Years;
import fields.f2_7.F2_7PointsTotalActivity;
import fields.f2_7.F2_7TotalPages;
import fields.f2_7.F2_7Year;

public class P2_7Parser extends Parser {

	private String fileName;
	private ArrayList<Field> listOfFields;
	private String[] authorsTeam;

	public P2_7Parser(String fileName) {
		this.fileName = fileName;
		listOfFields = new ArrayList<Field>();
	}
	
	@Override
	protected ArrayList<Field> parse() throws IOException,
			FileNotFoundException {
		try {
			InputStream io = new FileInputStream(fileName);
			wb = new XSSFWorkbook(io);
			XSSFSheet sheet = wb.getSheet("2.7");
			Integer nrCrt;
			for (Iterator<Row> it = sheet.rowIterator(); it.hasNext();) {
				Row row = (XSSFRow) it.next();
				for (nrCrt = 1; nrCrt <= sheet.getPhysicalNumberOfRows(); nrCrt++) {
					if (row.getCell('A' - 'A').toString().equals(nrCrt.toString()) && (row.getCell('B' - 'A').getCellType() != Cell.CELL_TYPE_BLANK)) {
						String authors  = computeCell(row.getCell('B' - 'A'));
						authorsTeam = computeString(authors);
						listOfFields.add(new F2_7Authors(authorsTeam));
						String bookTitle = computeCell(row.getCell('C' - 'A'));
						listOfFields.add(new F2_7BookTitle(bookTitle));
						String multiplicationDetails = computeCell(row.getCell('D' - 'A'));
						listOfFields.add(new F2_7MultiplicationDetails(multiplicationDetails));
						String year = computeCell(row.getCell('E' - 'A'));
						listOfFields.add(new F2_7Year(year));
						String totalPages = computeCell(row.getCell('F' - 'A'));
						listOfFields.add(new F2_7TotalPages(totalPages));
						String ownPages = computeCell(row.getCell('G' - 'A'));
						listOfFields.add(new F2_7OwnPages(ownPages));
						String pointsLast3Years = computeCell(row.getCell('H' - 'A'));
						listOfFields.add(new F2_7PointsLast3Years(pointsLast3Years));
						String pointsTotalActivity = computeCell(row.getCell('I' - 'A'));
						listOfFields.add(new F2_7PointsTotalActivity(pointsTotalActivity));
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
