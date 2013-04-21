package parsers;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import fields.Field;

public class Execute {

	public static void main(String[] args) throws FileNotFoundException,
			IOException {
		Parser p4_3Parser = new P4_3Parser("src//1.xlsx");
		Parser p4_2bParser = new P4_2bParser("src//1.xlsx");
		Parser p4_2aParser = new P4_2aParser("src//1.xlsx");
		Parser p4_1Parser = new P4_1Parser("src//1.xlsx");
		Parser p3_7Parser = new P3_7Parser("src//1.xlsx");
		Parser p3_6bParser = new P3_6bParser("src//1.xlsx");
		Parser p3_6aParser = new P3_6aParser("src//1.xlsx");
		Parser p3_5bParser = new P3_5bParser("src//1.xlsx");
		Parser p3_5aParser = new P3_5aParser("src//1.xlsx");
		Parser p3_4bParser = new P3_4bParser("src//1.xlsx");
		ArrayList<Field> p4_3FieldsList;
		ArrayList<Field> p4_2bFieldsList;
		ArrayList<Field> p4_2aFieldsList;
		ArrayList<Field> p4_1FieldsList;
		ArrayList<Field> p3_7FieldsList;
		ArrayList<Field> p3_6bFieldsList;
		ArrayList<Field> p3_6aFieldsList;
		ArrayList<Field> p3_5bFieldsList;
		ArrayList<Field> p3_5aFieldsList;
		ArrayList<Field> p3_4bFieldsList;

		try {
			// p4_3FieldsList = p4_3Parser.parse();
			// for (Field f : p4_3FieldsList)
			// {
			// f.print();
			// }

//			p4_2bFieldsList = p4_2bParser.parse();
//			for (Field f : p4_2bFieldsList) {
//				f.print();
//			}
			
//			p4_2aFieldsList = p4_2aParser.parse();
//			for (Field f : p4_2aFieldsList) {
//				f.print();
//			}
			
//			p4_1FieldsList = p4_1Parser.parse();
//			for (Field f : p4_1FieldsList) {
//				f.print();
//			}
			
//			p3_7FieldsList = p3_7Parser.parse();
//			for (Field f : p3_7FieldsList) {
//				f.print();
//			}
			
//			p3_6bFieldsList = p3_6bParser.parse();
//			for (Field f : p3_6bFieldsList) {
//				f.print();
//			}
			
//			p3_6aFieldsList = p3_6aParser.parse();
//			for (Field f : p3_6aFieldsList) {
//				f.print();
//			}
			
//			p3_5bFieldsList = p3_5bParser.parse();
//			for (Field f : p3_5bFieldsList) {
//				f.print();
//			}
			
//			p3_5aFieldsList = p3_5aParser.parse();
//			for (Field f : p3_5aFieldsList) {
//				f.print();
//			}
			
//			p3_4bFieldsList = p3_4bParser.parse();
//			for (Field f : p3_4bFieldsList) {
//				f.print();
//			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
