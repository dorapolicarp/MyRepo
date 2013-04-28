package fields.f2_2;

import fields.Field;

public class F2_2PointsLast3Years implements Field {

	private String value;

	public F2_2PointsLast3Years(String value) {
		this.value = value;
	}

	@Override
	public void print() {
		System.out.println("F2_2PointsLast3Years: " + value);
	}

}
