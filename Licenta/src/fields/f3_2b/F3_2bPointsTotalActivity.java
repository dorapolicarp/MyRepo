package fields.f3_2b;

import fields.Field;

public class F3_2bPointsTotalActivity implements Field {

	private String value;

	public F3_2bPointsTotalActivity(String value) {
		this.value = value;
	}

	@Override
	public void print() {
		System.out.println("F3_2bPointsTotalActivity: " + value);
	}

}