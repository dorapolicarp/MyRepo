package fields.f2_7;

import fields.Field;

public class F2_7BookTitle implements Field {

	private String value;

	public F2_7BookTitle(String value) {
		this.value = value;
	}

	@Override
	public void print() {
		System.out.println("F2_7BookTitle: " + value);
	}

}
