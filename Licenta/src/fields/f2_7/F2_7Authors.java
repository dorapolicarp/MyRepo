package fields.f2_7;

import fields.Field;

public class F2_7Authors implements Field {

	private String[] values;

	public F2_7Authors(String[] values) {
		this.values = values;
	}

	@Override
	public void print() {
		StringBuffer sb = new StringBuffer();
		sb.append("F2_7Authors: ");
		for (String s : values) {
			sb.append(s);
			sb.append(", ");
		}
		System.out.println(sb);
	}

}
