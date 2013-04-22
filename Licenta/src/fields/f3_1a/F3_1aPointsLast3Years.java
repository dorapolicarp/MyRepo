package fields.f3_1a;

import fields.Field;

public class F3_1aPointsLast3Years implements Field {

	private String value;

	public F3_1aPointsLast3Years(String value) {
		this.value = value;
	}

	@Override
	public void print() {
		System.out.println("F3_1aPointsLast3Years: " + value);
	}

}
