package fields.f2_1;

import fields.Field;

public class F2_1Authors implements Field {

	private String[] values;

	public F2_1Authors(String[] values) {
		this.values = values;
	}

	@Override
	public void print() {
		StringBuffer sb = new StringBuffer();
		sb.append("F2_1Authors: ");
		for (String s : values) {
			sb.append(s);
			sb.append(", ");
		}
		System.out.println(sb);
	}

}
