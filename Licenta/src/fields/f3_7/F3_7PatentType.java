package fields.f3_7;

import fields.Field;

public class F3_7PatentType implements Field {

	private String value;

	public F3_7PatentType(String value) {
		this.value = value;
	}

	@Override
	public void print() {
		System.out.println("F3_7PatentType: " + value);
	}

}
