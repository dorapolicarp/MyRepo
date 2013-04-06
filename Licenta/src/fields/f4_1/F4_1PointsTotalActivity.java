package fields.f4_1;

import fields.Field;

public class F4_1PointsTotalActivity implements Field {

	private String value;

	public F4_1PointsTotalActivity(String value) {
		this.value = value;
	}

	@Override
	public void print() {
		System.out.println("F4_1PointsTotalActivity: " + value);
	}

}
