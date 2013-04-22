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
import fields.f3_1a.F3_1aAuthors;
import fields.f3_1a.F3_1aImpactFactor;
import fields.f3_1a.F3_1aMagazine;
import fields.f3_1a.F3_1aPages;
import fields.f3_1a.F3_1aPaperTitle;
import fields.f3_1a.F3_1aPointsLast3Years;
import fields.f3_1a.F3_1aPointsTotalActivity;
import fields.f3_1a.F3_1aVolumeNumber;
import fields.f3_1a.F3_1aYear;

public class P3_1aParser extends Parser {

	private String fileName;
	private ArrayList<Field> listOfFields;
	private String[] authorsTeam;

	public P3_1aParser(String fileName) {
		this.fileName = fileName;
		listOfFields = new ArrayList<Field>();
	}
	
	@Override
	protected ArrayList<Field> parse() throws IOException,
			FileNotFoundException {
		try {
			InputStream io = new FileInputStream(fileName);
			wb = new XSSFWorkbook(io);
			XSSFSheet sheet = wb.getSheet("3.1a");
			Integer nrCrt;
			for (Iterator<Row> it = sheet.rowIterator(); it.hasNext();) {
				Row row = (XSSFRow) it.next();
				for (nrCrt = 1; nrCrt <= sheet.getPhysicalNumberOfRows(); nrCrt++) {
					if (row.getCell('A' - 'A').toString().equals(nrCrt.toString()) && (row.getCell('B' - 'A').getCellType() != Cell.CELL_TYPE_BLANK)) {
						String authors  = computeCell(row.getCell('B' - 'A'));
						authorsTeam = computeString(authors);
						listOfFields.add(new F3_1aAuthors(authorsTeam));
						String paperTitle = computeCell(row.getCell('C' - 'A'));
						listOfFields.add(new F3_1aPaperTitle(paperTitle));
						String magazine = computeCell(row.getCell('D' - 'A'));
						listOfFields.add(new F3_1aMagazine(magazine));
						String year = computeCell(row.getCell('E' - 'A'));
						listOfFields.add(new F3_1aYear(year));
						String volumeNumber = computeCell(row.getCell('F' - 'A'));
						listOfFields.add(new F3_1aVolumeNumber(volumeNumber));
						String pages = computeCell(row.getCell('G' - 'A'));
						listOfFields.add(new F3_1aPages(pages));
						String impactFactor = computeCell(row.getCell('H' - 'A'));
						listOfFields.add(new F3_1aImpactFactor(impactFactor));
						String pointsLast3Years = computeCell(row.getCell('I' - 'A'));
						listOfFields.add(new F3_1aPointsLast3Years(pointsLast3Years));
						String pointsTotalActivity = computeCell(row.getCell('J' - 'A'));
						listOfFields.add(new F3_1aPointsTotalActivity(pointsTotalActivity));
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
