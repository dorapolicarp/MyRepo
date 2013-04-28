package fields.f2_2;

import fields.Field;

public class F2_2PointsTotalActivity implements Field {

	private String value;

	public F2_2PointsTotalActivity(String value) {
		this.value = value;
	}

	@Override
	public void print() {
		System.out.println("F2_2PointsTotalActivity: " + value);
	}

}
