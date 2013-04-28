package fields.f2_2;

import fields.Field;

public class F2_2Authors implements Field {

	private String[] values;

	public F2_2Authors(String[] values) {
		this.values = values;
	}

	@Override
	public void print() {
		StringBuffer sb = new StringBuffer();
		sb.append("F2_2Authors: ");
		for (String s : values) {
			sb.append(s);
			sb.append(", ");
		}
		System.out.println(sb);
	}

}
