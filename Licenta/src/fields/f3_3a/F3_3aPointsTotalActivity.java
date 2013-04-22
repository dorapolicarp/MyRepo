package fields.f3_3a;

import fields.Field;

public class F3_3aPointsTotalActivity implements Field {

	private String value;

	public F3_3aPointsTotalActivity(String value) {
		this.value = value;
	}

	@Override
	public void print() {
		System.out.println("F3_3aPointsTotalActivity: " + value);
	}

}
