package parsers;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import fields.Field;

abstract class Parser {
	protected XSSFWorkbook wb;

	protected abstract ArrayList<Field> parse() throws IOException,
			FileNotFoundException;

	protected String computeCell(Cell cell) {
		FormulaEvaluator evaluator = wb.getCreationHelper()
				.createFormulaEvaluator();
		int nType;
		String szValue = "";

		if (cell.getCellType() == Cell.CELL_TYPE_FORMULA) {
			nType = evaluator.evaluateFormulaCell(cell);
		} else {
			nType = cell.getCellType();
		}

		switch (nType) {
		case Cell.CELL_TYPE_STRING: {
			szValue = cell.getStringCellValue();
			break;
		}
		case Cell.CELL_TYPE_NUMERIC: {
			szValue = cell.getNumericCellValue() + "";
			break;
		}
		case Cell.CELL_TYPE_BLANK: {
			szValue = "BLANK";
			break;
		}
		case Cell.CELL_TYPE_BOOLEAN: {
			szValue = cell.getBooleanCellValue() + "";
			break;
		}
		case Cell.CELL_TYPE_ERROR: {
			szValue = cell.getErrorCellValue() + "";
			break;
		}
		}

		return szValue;
	}

	public String[] computeString(String s) {
		return s.split(",");
	}
}
