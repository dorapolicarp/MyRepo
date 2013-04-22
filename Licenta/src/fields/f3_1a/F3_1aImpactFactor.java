package fields.f3_1a;

import fields.Field;

public class F3_1aImpactFactor implements Field {

	private String value;

	public F3_1aImpactFactor(String value) {
		this.value = value;
	}

	@Override
	public void print() {
		System.out.println("F3_1aImpactFactor: " + value);
	}

}
