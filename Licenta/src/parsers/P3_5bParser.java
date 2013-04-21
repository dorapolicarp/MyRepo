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
import fields.f3_5b.F3_5bAuthors;
import fields.f3_5b.F3_5bDayMonth;
import fields.f3_5b.F3_5bIsbnIssn;
import fields.f3_5b.F3_5bPages;
import fields.f3_5b.F3_5bPaperDetails;
import fields.f3_5b.F3_5bPaperTitle;
import fields.f3_5b.F3_5bYear;
import fields.f3_7.F3_7PointsLast3Years;
import fields.f3_7.F3_7PointsTotalActivity;
public class P3_5bParser extends Parser {

	private String fileName;
	private ArrayList<Field> listOfFields;
	private String[] authorsTeam;

	public P3_5bParser(String fileName) {
		this.fileName = fileName;
		listOfFields = new ArrayList<Field>();
	}
	
	@Override
	protected ArrayList<Field> parse() throws IOException,
			FileNotFoundException {
		try {
			InputStream io = new FileInputStream(fileName);
			wb = new XSSFWorkbook(io);
			XSSFSheet sheet = wb.getSheet("3.5b");
			Integer nrCrt;
			for (Iterator<Row> it = sheet.rowIterator(); it.hasNext();) {
				Row row = (XSSFRow) it.next();
				for (nrCrt = 1; nrCrt <= sheet.getPhysicalNumberOfRows(); nrCrt++) {
					if (row.getCell('A' - 'A').toString().equals(nrCrt.toString()) && (row.getCell('B' - 'A').getCellType() != Cell.CELL_TYPE_BLANK)) {
						String authors  = computeCell(row.getCell('B' - 'A'));
						authorsTeam = computeString(authors);
						listOfFields.add(new F3_5bAuthors(authorsTeam));
						String paperTitle = computeCell(row.getCell('C' - 'A'));
						listOfFields.add(new F3_5bPaperTitle(paperTitle));
						String paperDetails = computeCell(row.getCell('D' - 'A'));
						listOfFields.add(new F3_5bPaperDetails(paperDetails));
						String year = computeCell(row.getCell('E' - 'A'));
						listOfFields.add(new F3_5bYear(year));
						String dayMonth = computeCell(row.getCell('F' - 'A'));
						listOfFields.add(new F3_5bDayMonth(dayMonth));
						String isbnIssn = computeCell(row.getCell('G' - 'A'));
						listOfFields.add(new F3_5bIsbnIssn(isbnIssn));
						String pages = computeCell(row.getCell('H' - 'A'));
						listOfFields.add(new F3_5bPages(pages));
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
