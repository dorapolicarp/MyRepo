package fields.f3_3b;

import fields.Field;

public class F3_3bPointsLast3Years implements Field {

	private String value;

	public F3_3bPointsLast3Years(String value) {
		this.value = value;
	}

	@Override
	public void print() {
		System.out.println("F3_3bPointsLast3Years: " + value);
	}

}
