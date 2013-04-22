package fields.f2_6;

import fields.Field;

public class F2_6PointsLast3Years implements Field {

	private String value;

	public F2_6PointsLast3Years(String value) {
		this.value = value;
	}

	@Override
	public void print() {
		System.out.println("F2_6PointsLast3Years: " + value);
	}

}
