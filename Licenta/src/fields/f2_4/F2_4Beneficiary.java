package fields.f2_4;

import fields.Field;

public class F2_4Beneficiary implements Field {

	private String value;

	public F2_4Beneficiary(String value) {
		this.value = value;
	}

	@Override
	public void print() {
		System.out.println("F2_4Beneficiary: " + value);
	}

}
