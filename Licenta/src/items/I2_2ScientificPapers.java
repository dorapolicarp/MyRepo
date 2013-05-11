package items;

import java.util.ArrayList;
import java.util.List;

import fields.Field;

public class I2_2ScientificPapers implements ResearchItem {

	private List<Field> list;
	
	public I2_2ScientificPapers() {
		list = new ArrayList<Field>();
	}
	
	@Override
	public void print() {
		// TODO Auto-generated method stub

	}

	@Override
	public void addFields(List<Field> listOfFields) {
		list.addAll(listOfFields);
	}

}
