package fields.f3_3b;

import fields.Field;

public class F3_3bAuthors implements Field {

	private String[] values;

	public F3_3bAuthors(String[] values) {
		this.values = values;
	}

	@Override
	public void print() {
		StringBuffer sb = new StringBuffer();
		sb.append("F3_3bAuthors: ");
		for (String s : values) {
			sb.append(s);
			sb.append(", ");
		}
		System.out.println(sb);
	}

}
