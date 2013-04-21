package fields.f3_5a;

import fields.Field;

public class F3_5aAuthors implements Field {

	private String[] values;

	public F3_5aAuthors(String[] values) {
		this.values = values;
	}

	@Override
	public void print() {
		StringBuffer sb = new StringBuffer();
		sb.append("F3_5aAuthors: ");
		for (String s : values) {
			sb.append(s);
			sb.append(", ");
		}
		System.out.println(sb);
	}

}
