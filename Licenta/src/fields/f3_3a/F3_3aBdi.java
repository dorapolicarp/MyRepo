package fields.f3_3a;

import fields.Field;

public class F3_3aBdi implements Field {

	private String value;

	public F3_3aBdi(String value) {
		this.value = value;
	}

	@Override
	public void print() {
		System.out.println("F3_3aBdi: " + value);
	}

}
