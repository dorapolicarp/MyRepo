package fields.f3_3a;

import fields.Field;

public class F3_3aAuthors implements Field {

	private String[] values;

	public F3_3aAuthors(String[] values) {
		this.values = values;
	}

	@Override
	public void print() {
		StringBuffer sb = new StringBuffer();
		sb.append("F3_3aAuthors: ");
		for (String s : values) {
			sb.append(s);
			sb.append(", ");
		}
		System.out.println(sb);
	}

}
