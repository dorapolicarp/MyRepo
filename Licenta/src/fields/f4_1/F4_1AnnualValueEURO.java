package fields.f4_1;

import fields.Field;

public class F4_1AnnualValueEURO implements Field {

	private String value;

	public F4_1AnnualValueEURO(String value) {
		this.value = value;
	}

	@Override
	public void print() {
		System.out.println("F4_1AnnualValueEURO: " + value);
	}

}
