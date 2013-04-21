package fields.f3_5a;

import fields.Field;

public class F3_5aYear implements Field {

	private String value;

	public F3_5aYear(String value) {
		this.value = value;
	}

	@Override
	public void print() {
		System.out.println("F3_5aYear: " + value);
	}

}
