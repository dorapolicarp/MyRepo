package fields.f4_2b;

import fields.Field;

public class F4_2bContractNumber implements Field {
	private String value;

	public F4_2bContractNumber(String value) {
		this.value = value;
	}

	@Override
	public void print() {
		System.out.println("F4_2bContractNumber: " + value);
	}

}
