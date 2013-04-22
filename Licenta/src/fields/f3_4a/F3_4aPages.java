package fields.f3_4a;

import fields.Field;

public class F3_4aPages implements Field {

	private String value;

	public F3_4aPages(String value) {
		this.value = value;
	}

	@Override
	public void print() {
		System.out.println("F3_4aPages: " + value);
	}

}
