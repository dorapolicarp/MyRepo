package fields.f2_5;

import fields.Field;

public class F2_5PointsTotalActivity implements Field {

	private String value;

	public F2_5PointsTotalActivity(String value) {
		this.value = value;
	}

	@Override
	public void print() {
		System.out.println("F2_5PointsTotalActivity: " + value);
	}

}
