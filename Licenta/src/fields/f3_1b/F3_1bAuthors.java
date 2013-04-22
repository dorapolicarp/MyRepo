package fields.f3_1b;

import fields.Field;

public class F3_1bAuthors implements Field {

	private String[] values;

	public F3_1bAuthors(String[] values) {
		this.values = values;
	}

	@Override
	public void print() {
		StringBuffer sb = new StringBuffer();
		sb.append("F3_1bAuthors: ");
		for (String s : values) {
			sb.append(s);
			sb.append(", ");
		}
		System.out.println(sb);
	}

}
