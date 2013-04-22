package fields.f3_2a;

import fields.Field;

public class F3_2aAuthors implements Field {

	private String[] values;

	public F3_2aAuthors(String[] values) {
		this.values = values;
	}

	@Override
	public void print() {
		StringBuffer sb = new StringBuffer();
		sb.append("F3_2aAuthors: ");
		for (String s : values) {
			sb.append(s);
			sb.append(", ");
		}
		System.out.println(sb);
	}

}
