package fields.f3_5b;

import fields.Field;

public class F3_5bIsbnIssn implements Field {

	private String value;

	public F3_5bIsbnIssn(String value) {
		this.value = value;
	}

	@Override
	public void print() {
		System.out.println("F3_5bIsbnIssn: " + value);
	}

}
