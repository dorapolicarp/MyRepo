package items;

import java.util.ArrayList;
import java.util.List;

import fields.Field;

public class I3_2aScientificPapers implements ResearchItem {

	private List<Field> list;
	
	public I3_2aScientificPapers() {
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
