package fields.f3_6a;

import fields.Field;

public class F3_6aPointsLast3Years implements Field {

	private String value;

	public F3_6aPointsLast3Years(String value) {
		this.value = value;
	}

	@Override
	public void print() {
		System.out.println("F3_6aPointsLast3Years: " + value);
	}

}
