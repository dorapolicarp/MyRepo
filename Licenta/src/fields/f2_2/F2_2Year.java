package fields.f2_2;

import fields.Field;

public class F2_2Year implements Field {

	private String value;

	public F2_2Year(String value) {
		this.value = value;
	}

	@Override
	public void print() {
		System.out.println("F2_2Year: " + value);
	}

}
