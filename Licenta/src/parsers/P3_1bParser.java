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
import fields.f3_1b.F3_1bAuthors;
import fields.f3_1b.F3_1bImpactFactor;
import fields.f3_1b.F3_1bMagazine;
import fields.f3_1b.F3_1bPages;
import fields.f3_1b.F3_1bPaperTitle;
import fields.f3_1b.F3_1bPointsLast3Years;
import fields.f3_1b.F3_1bPointsTotalActivity;
import fields.f3_1b.F3_1bVolumeNumber;
import fields.f3_1b.F3_1bYear;

public class P3_1bParser extends Parser {

	private String fileName;
	private ArrayList<Field> listOfFields;
	private String[] authorsTeam;

	public P3_1bParser(String fileName) {
		this.fileName = fileName;
		listOfFields = new ArrayList<Field>();
	}
	
	@Override
	protected ArrayList<Field> parse() throws IOException,
			FileNotFoundException {
		try {
			InputStream io = new FileInputStream(fileName);
			wb = new XSSFWorkbook(io);
			XSSFSheet sheet = wb.getSheet("3.6a");
			Integer nrCrt;
			for (Iterator<Row> it = sheet.rowIterator(); it.hasNext();) {
				Row row = (XSSFRow) it.next();
				for (nrCrt = 1; nrCrt <= sheet.getPhysicalNumberOfRows(); nrCrt++) {
					if (row.getCell('A' - 'A').toString().equals(nrCrt.toString()) && (row.getCell('B' - 'A').getCellType() != Cell.CELL_TYPE_BLANK)) {
						String authors  = computeCell(row.getCell('B' - 'A'));
						authorsTeam = computeString(authors);
						listOfFields.add(new F3_1bAuthors(authorsTeam));
						String paperTitle = computeCell(row.getCell('C' - 'A'));
						listOfFields.add(new F3_1bPaperTitle(paperTitle));
						String magazine = computeCell(row.getCell('D' - 'A'));
						listOfFields.add(new F3_1bMagazine(magazine));
						String year = computeCell(row.getCell('E' - 'A'));
						listOfFields.add(new F3_1bYear(year));
						String volumeNumber = computeCell(row.getCell('F' - 'A'));
						listOfFields.add(new F3_1bVolumeNumber(volumeNumber));
						String pages = computeCell(row.getCell('G' - 'A'));
						listOfFields.add(new F3_1bPages(pages));
						String impactFactor = computeCell(row.getCell('H' - 'A'));
						listOfFields.add(new F3_1bImpactFactor(impactFactor));
						String pointsLast3Years = computeCell(row.getCell('I' - 'A'));
						listOfFields.add(new F3_1bPointsLast3Years(pointsLast3Years));
						String pointsTotalActivity = computeCell(row.getCell('J' - 'A'));
						listOfFields.add(new F3_1bPointsTotalActivity(pointsTotalActivity));
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
