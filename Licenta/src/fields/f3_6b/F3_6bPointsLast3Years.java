package fields.f3_6b;

import fields.Field;

public class F3_6bPointsLast3Years implements Field {

	private String value;

	public F3_6bPointsLast3Years(String value) {
		this.value = value;
	}

	@Override
	public void print() {
		System.out.println("F3_6bPointsLast3Years: " + value);
	}

}
