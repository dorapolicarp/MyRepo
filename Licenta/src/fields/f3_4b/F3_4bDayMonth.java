package fields.f3_4b;

import fields.Field;

public class F3_4bDayMonth implements Field {

	private String value;

	public F3_4bDayMonth(String value) {
		this.value = value;
	}

	@Override
	public void print() {
		System.out.println("F3_4bDayMonth: " + value);
	}

}
