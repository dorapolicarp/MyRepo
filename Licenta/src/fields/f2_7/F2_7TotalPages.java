package fields.f2_7;

import fields.Field;

public class F2_7TotalPages implements Field {

	private String value;

	public F2_7TotalPages(String value) {
		this.value = value;
	}

	@Override
	public void print() {
		System.out.println("F2_7TotalPages: " + value);
	}

}
