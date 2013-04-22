package fields.f3_1b;

import fields.Field;

public class F3_1bMagazine implements Field {

	private String value;

	public F3_1bMagazine(String value) {
		this.value = value;
	}

	@Override
	public void print() {
		System.out.println("F3_1bMagazine: " + value);
	}

}
