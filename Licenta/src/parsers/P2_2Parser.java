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
import fields.f2_2.F2_2Authors;
import fields.f2_2.F2_2BookTitle;
import fields.f2_2.F2_2Isbn;
import fields.f2_2.F2_2OwnPages;
import fields.f2_2.F2_2PointsLast3Years;
import fields.f2_2.F2_2PointsTotalActivity;
import fields.f2_2.F2_2Publisher;
import fields.f2_2.F2_2TotalPages;
import fields.f2_2.F2_2Year;

public class P2_2Parser extends Parser {

	private String fileName;
	private ArrayList<Field> listOfFields;
	private String[] authorsTeam;

	public P2_2Parser(String fileName) {
		this.fileName = fileName;
		listOfFields = new ArrayList<Field>();
	}
	
	@Override
	protected ArrayList<Field> parse() throws IOException,
			FileNotFoundException {
		try {
			InputStream io = new FileInputStream(fileName);
			wb = new XSSFWorkbook(io);
			XSSFSheet sheet = wb.getSheet("2.2");
			Integer nrCrt;
			for (Iterator<Row> it = sheet.rowIterator(); it.hasNext();) {
				Row row = (XSSFRow) it.next();
				for (nrCrt = 1; nrCrt <= sheet.getPhysicalNumberOfRows(); nrCrt++) {
					if (row.getCell('A' - 'A').toString().equals(nrCrt.toString()) && (row.getCell('B' - 'A').getCellType() != Cell.CELL_TYPE_BLANK)) {
						String authors  = computeCell(row.getCell('B' - 'A'));
						authorsTeam = computeString(authors);
						listOfFields.add(new F2_2Authors(authorsTeam));
						String bookTitle = computeCell(row.getCell('C' - 'A'));
						listOfFields.add(new F2_2BookTitle(bookTitle));
						String publisher = computeCell(row.getCell('D' - 'A'));
						listOfFields.add(new F2_2Publisher(publisher));
						String isbn = computeCell(row.getCell('E' - 'A'));
						listOfFields.add(new F2_2Isbn(isbn));
						String year = computeCell(row.getCell('F' - 'A'));
						listOfFields.add(new F2_2Year(year));
						String totalPages = computeCell(row.getCell('G' - 'A'));
						listOfFields.add(new F2_2TotalPages(totalPages));
						String ownPages = computeCell(row.getCell('H' - 'A'));
						listOfFields.add(new F2_2OwnPages(ownPages));
						String pointsLast3Years = computeCell(row.getCell('I' - 'A'));
						listOfFields.add(new F2_2PointsLast3Years(pointsLast3Years));
						String pointsTotalActivity = computeCell(row.getCell('J' - 'A'));
						listOfFields.add(new F2_2PointsTotalActivity(pointsTotalActivity));
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
