package fields.f2_6;

import fields.Field;

public class F2_6TotalPages implements Field {

	private String value;

	public F2_6TotalPages(String value) {
		this.value = value;
	}

	@Override
	public void print() {
		System.out.println("F2_6TotalPages: " + value);
	}

}
