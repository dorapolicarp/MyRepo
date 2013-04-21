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
import fields.f3_6b.F3_6bAuthors;
import fields.f3_6b.F3_6bDayMonth;
import fields.f3_6b.F3_6bIsbnIssn;
import fields.f3_6b.F3_6bPages;
import fields.f3_6b.F3_6bPaperDetails;
import fields.f3_6b.F3_6bPaperTitle;
import fields.f3_6b.F3_6bYear;
import fields.f3_7.F3_7PointsLast3Years;
import fields.f3_7.F3_7PointsTotalActivity;

public class P3_6bParser extends Parser {

	private String fileName;
	private ArrayList<Field> listOfFields;
	private String[] authorsTeam;

	public P3_6bParser(String fileName) {
		this.fileName = fileName;
		listOfFields = new ArrayList<Field>();
	}
	
	@Override
	protected ArrayList<Field> parse() throws IOException,
			FileNotFoundException {
		try {
			InputStream io = new FileInputStream(fileName);
			wb = new XSSFWorkbook(io);
			XSSFSheet sheet = wb.getSheet("3.6b");
			Integer nrCrt;
			for (Iterator<Row> it = sheet.rowIterator(); it.hasNext();) {
				Row row = (XSSFRow) it.next();
				for (nrCrt = 1; nrCrt <= sheet.getPhysicalNumberOfRows(); nrCrt++) {
					if (row.getCell('A' - 'A').toString().equals(nrCrt.toString()) && (row.getCell('B' - 'A').getCellType() != Cell.CELL_TYPE_BLANK)) {
						String authors  = computeCell(row.getCell('B' - 'A'));
						authorsTeam = computeString(authors);
						listOfFields.add(new F3_6bAuthors(authorsTeam));
						String paperTitle = computeCell(row.getCell('C' - 'A'));
						listOfFields.add(new F3_6bPaperTitle(paperTitle));
						String paperDetails = computeCell(row.getCell('D' - 'A'));
						listOfFields.add(new F3_6bPaperDetails(paperDetails));
						String year = computeCell(row.getCell('E' - 'A'));
						listOfFields.add(new F3_6bYear(year));
						String dayMonth = computeCell(row.getCell('F' - 'A'));
						listOfFields.add(new F3_6bDayMonth(dayMonth));
						String isbnIssn = computeCell(row.getCell('G' - 'A'));
						listOfFields.add(new F3_6bIsbnIssn(isbnIssn));
						String pages = computeCell(row.getCell('H' - 'A'));
						listOfFields.add(new F3_6bPages(pages));
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
