package fields.f3_3b;

import fields.Field;

public class F3_3bPages implements Field {

	private String value;

	public F3_3bPages(String value) {
		this.value = value;
	}

	@Override
	public void print() {
		System.out.println("F3_3bPages: " + value);
	}

}
