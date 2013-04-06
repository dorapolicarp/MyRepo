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
import fields.f4_3.F4_3AnnualValueEURO;
import fields.f4_3.F4_3AnnualValueRON;
import fields.f4_3.F4_3Beneficiary;
import fields.f4_3.F4_3ContractName;
import fields.f4_3.F4_3ContractNumber;
import fields.f4_3.F4_3PointsLast3Years;
import fields.f4_3.F4_3PointsTotalActivity;
import fields.f4_3.F4_3ResearchTeam;
import fields.f4_3.F4_3TeamPosition;
import fields.f4_3.F4_3Year;
//import fields.F4_3PointsLast3Years;
//import fields.F4_3PointsTotalActivity;

public class P4_3Parser extends Parser {
	private String fileName;
	private ArrayList<Field> listOfFields;
	private String[] team;

	public P4_3Parser(String fileName) {
		this.fileName = fileName;
		listOfFields = new ArrayList<Field>();
	}

	@Override
	public ArrayList<Field> parse() throws IOException, FileNotFoundException {
		try {
			InputStream io = new FileInputStream(fileName);
			System.out.println("io=" + io);
			wb = new XSSFWorkbook(io);
			XSSFSheet sheet = wb.getSheet("4.3");
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
						listOfFields.add(new F4_3ResearchTeam(team));
						String contractName = computeCell(row
								.getCell('C' - 'A'));
						listOfFields.add(new F4_3ContractName(contractName));
						String contractNr = computeCell(row.getCell('D' - 'A'));
						listOfFields.add(new F4_3ContractNumber(contractNr));
						String year = computeCell(row.getCell('E' - 'A'));
						listOfFields.add(new F4_3Year(year));
						String annualValueRON = computeCell(row
								.getCell('F' - 'A'));
						listOfFields
								.add(new F4_3AnnualValueRON(annualValueRON));
						String annualValueEURO = computeCell(row
								.getCell('G' - 'A'));
						listOfFields.add(new F4_3AnnualValueEURO(
								annualValueEURO));
						String beneficiary = computeCell(row.getCell('H' - 'A'));
						listOfFields.add(new F4_3Beneficiary(beneficiary));
						String teamPosition = "";
						if (row.getCell('I' - 'A').getCellType() != Cell.CELL_TYPE_BLANK)
							teamPosition = computeCell(teamPositionRow
									.getCell('I' - 'A'));
						else
							teamPosition = computeCell(teamPositionRow
									.getCell('J' - 'A'));
						listOfFields.add(new F4_3TeamPosition(teamPosition));
						String pointsLast3Years = computeCell(row
								.getCell('K' - 'A'));
						listOfFields.add(new F4_3PointsLast3Years(
								pointsLast3Years));
						String pointsTotalActivity = computeCell(row
								.getCell('L' - 'A'));
						listOfFields.add(new F4_3PointsTotalActivity(
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
	// Parser p4_3Parser = new P4_3Parser("src//1.xlsx");
	// // Parser p4_2bParser = new P4_2bParser("src//1.xlsx");
	// ArrayList<Field> p4_3FieldsList;
	// // ArrayList<Field> p4_2bFieldsList;
	//
	// try
	// {
	// p4_3FieldsList = p4_3Parser.parse();
	// for (Field f : p4_3FieldsList)
	// {
	// f.print();
	// }
	//
	//
	//
	// }
	// catch (Exception e)
	// {
	// e.printStackTrace();
	// }
	// }
}
