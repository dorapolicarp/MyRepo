package fields.f4_3;

import fields.Field;

public class F4_3ContractName implements Field {
	private String value;

	public F4_3ContractName(String value) {
		this.value = value;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("F4_3ContractName: " + value);
	}

}
