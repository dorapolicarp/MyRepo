package fields.f2_1;

import fields.Field;

public class F2_1PointsTotalActivity implements Field {

	private String value;

	public F2_1PointsTotalActivity(String value) {
		this.value = value;
	}

	@Override
	public void print() {
		System.out.println("F2_1PointsTotalActivity: " + value);
	}

}
