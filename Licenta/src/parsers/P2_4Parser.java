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
import fields.f2_4.F2_4Authors;
import fields.f2_4.F2_4Beneficiary;
import fields.f2_4.F2_4OwnPages;
import fields.f2_4.F2_4PointsLast3Years;
import fields.f2_4.F2_4PointsTotalActivity;
import fields.f2_4.F2_4TotalPages;
import fields.f2_4.F2_4WebAddress;
import fields.f2_4.F2_4WorkTitle;
import fields.f2_4.F2_4Year;

public class P2_4Parser extends Parser {

	private String fileName;
	private ArrayList<Field> listOfFields;
	private String[] authorsTeam;

	public P2_4Parser(String fileName) {
		this.fileName = fileName;
		listOfFields = new ArrayList<Field>();
	}
	
	@Override
	protected ArrayList<Field> parse() throws IOException,
			FileNotFoundException {
		try {
			InputStream io = new FileInputStream(fileName);
			wb = new XSSFWorkbook(io);
			XSSFSheet sheet = wb.getSheet("2.4");
			Integer nrCrt;
			for (Iterator<Row> it = sheet.rowIterator(); it.hasNext();) {
				Row row = (XSSFRow) it.next();
				for (nrCrt = 1; nrCrt <= sheet.getPhysicalNumberOfRows(); nrCrt++) {
					if (row.getCell('A' - 'A').toString().equals(nrCrt.toString()) && (row.getCell('B' - 'A').getCellType() != Cell.CELL_TYPE_BLANK)) {
						String authors  = computeCell(row.getCell('B' - 'A'));
						authorsTeam = computeString(authors);
						listOfFields.add(new F2_4Authors(authorsTeam));
						String workTitle = computeCell(row.getCell('C' - 'A'));
						listOfFields.add(new F2_4WorkTitle(workTitle));
						String webAddress = computeCell(row.getCell('D' - 'A'));
						listOfFields.add(new F2_4WebAddress(webAddress));
						String beneficiary = computeCell(row.getCell('E' - 'A'));
						listOfFields.add(new F2_4Beneficiary(beneficiary));
						String year = computeCell(row.getCell('F' - 'A'));
						listOfFields.add(new F2_4Year(year));
						String totalPages = computeCell(row.getCell('G' - 'A'));
						listOfFields.add(new F2_4TotalPages(totalPages));
						String ownPages = computeCell(row.getCell('H' - 'A'));
						listOfFields.add(new F2_4OwnPages(ownPages));
						String pointsLast3Years = computeCell(row.getCell('I' - 'A'));
						listOfFields.add(new F2_4PointsLast3Years(pointsLast3Years));
						String pointsTotalActivity = computeCell(row.getCell('J' - 'A'));
						listOfFields.add(new F2_4PointsTotalActivity(pointsTotalActivity));
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
