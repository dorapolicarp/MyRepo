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
import fields.f4_2b.F4_2bAnnualValueEURO;
import fields.f4_2b.F4_2bAnnualValueRON;
import fields.f4_2b.F4_2bBeneficiary;
import fields.f4_2b.F4_2bContractName;
import fields.f4_2b.F4_2bContractNumber;
import fields.f4_2b.F4_2bPointsLast3Years;
import fields.f4_2b.F4_2bPointsTotalActivity;
import fields.f4_2b.F4_2bResearchTeam;
import fields.f4_2b.F4_2bTeamPosition;
import fields.f4_2b.F4_2bYear;

public class P4_2bParser extends Parser {
	private String fileName;
	private ArrayList<Field> listOfFields;
	private String[] team;

	public P4_2bParser(String fileName) {
		this.fileName = fileName;
		listOfFields = new ArrayList<Field>();
	}

	@Override
	protected ArrayList<Field> parse() throws IOException,
			FileNotFoundException {
		try {
			InputStream io = new FileInputStream(fileName);
			wb = new XSSFWorkbook(io);
			XSSFSheet sheet = wb.getSheet("4.2b");
			Row teamPositionRow = sheet.getRow(8);
			Integer nrCrt;
			for (Iterator<Row> it = sheet.rowIterator(); it.hasNext();) {
				Row row = (XSSFRow) it.next();
				for (nrCrt = 1; nrCrt <= sheet.getPhysicalNumberOfRows(); nrCrt++) {
					if (row.getCell('A' - 'A').toString()
							.equals(nrCrt.toString())
							&& (row.getCell('B' - 'A').getCellType() != Cell.CELL_TYPE_BLANK)) {
						String researchTeam = computeCell(row
								.getCell('B' - 'A'));
						team = computeString(researchTeam);
						listOfFields.add(new F4_2bResearchTeam(team));
						String contractName = computeCell(row
								.getCell('C' - 'A'));
						listOfFields.add(new F4_2bContractName(contractName));
						String contractNr = computeCell(row.getCell('D' - 'A'));
						listOfFields.add(new F4_2bContractNumber(contractNr));
						String year = computeCell(row.getCell('E' - 'A'));
						listOfFields.add(new F4_2bYear(year));
						String annualValueRON = computeCell(row
								.getCell('F' - 'A'));
						listOfFields
								.add(new F4_2bAnnualValueRON(annualValueRON));
						String annualValueEURO = computeCell(row
								.getCell('G' - 'A'));
						listOfFields.add(new F4_2bAnnualValueEURO(
								annualValueEURO));
						String beneficiary = computeCell(row.getCell('H' - 'A'));
						listOfFields.add(new F4_2bBeneficiary(beneficiary));
						String teamPosition = "";
						if (row.getCell('I' - 'A').getCellType() != Cell.CELL_TYPE_BLANK)
							teamPosition = computeCell(teamPositionRow
									.getCell('I' - 'A'));
						else
							teamPosition = computeCell(teamPositionRow
									.getCell('J' - 'A'));
						listOfFields.add(new F4_2bTeamPosition(teamPosition));
						String pointsLast3Years = computeCell(row
								.getCell('K' - 'A'));
						listOfFields.add(new F4_2bPointsLast3Years(
								pointsLast3Years));
						String pointsTotalActivity = computeCell(row
								.getCell('L' - 'A'));
						listOfFields.add(new F4_2bPointsTotalActivity(
								pointsTotalActivity));
						// System.out.println("\nResearchTeam: " + researchTeam
						// + "\nContractName: " + contractName
						// + "\nContractNumber: " + contractNr + "\nYear: " +
						// year +
						// "\nAnnualValueRON: " + annualValueRON +
						// "\nAnnualValueEURO: "
						// + annualValueEURO + "\nBeneficiary: " + beneficiary
						// + "\nTeamPosition: " + teamPosition +
						// "\nPointsLast3Years: "
						// + pointsLast3Years + "\nPointsTotalActivity: " +
						// pointsTotalActivity);
					}

				}
			}
			io.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return listOfFields;
	}

	// public static void main(String[] args) throws FileNotFoundException,
	// IOException
	// {
	// // Parser p4_3Parser = new P4_3Parser("src//1.xlsx");
	// Parser p4_2bParser = new P4_2bParser("src//1.xlsx");
	// // ArrayList<Field> p4_3FieldsList;
	// // ArrayList<Field> p4_2bFieldsList = new ArrayList<Field>();
	//
	// try
	// {
	// // p4_3FieldsList = p4_3Parser.parse();
	// // for (Field f : p4_3FieldsList)
	// // {
	// // f.print();
	// // }
	//
	// ArrayList<Field> p4_2bFieldsList = new ArrayList<Field>();
	// p4_2bFieldsList = p4_2bParser.parse();
	// // p4_2bFieldsList.addAll(p4_2bParser.parse());
	// for (Field f : p4_2bFieldsList)
	// {
	// f.print();
	// }
	// }
	// catch (Exception e)
	// {
	// e.printStackTrace();
	// }
	// }
}
