package fields.f2_2;

import fields.Field;

public class F2_2BookTitle implements Field {

	private String value;

	public F2_2BookTitle(String value) {
		this.value = value;
	}

	@Override
	public void print() {
		System.out.println("F2_2BookTitle: " + value);
	}

}
