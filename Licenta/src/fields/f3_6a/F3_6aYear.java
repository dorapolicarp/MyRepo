package fields.f3_6a;

import fields.Field;

public class F3_6aYear implements Field {

	private String value;

	public F3_6aYear(String value) {
		this.value = value;
	}

	@Override
	public void print() {
		System.out.println("F3_6aYear: " + value);
	}


}
