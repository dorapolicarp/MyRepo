package fields.f4_2a;

import fields.Field;

public class F4_2aYear implements Field {

	private String value;

	public F4_2aYear(String value) {
		this.value = value;
	}

	@Override
	public void print() {
		System.out.println("F4_2aYear: " + value);
	}

}
