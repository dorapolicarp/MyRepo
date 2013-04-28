package fields.f2_3;

import fields.Field;

public class F2_3Publisher implements Field {

	private String value;

	public F2_3Publisher(String value) {
		this.value = value;
	}

	@Override
	public void print() {
		System.out.println("F2_3Publisher: " + value);
	}

}
