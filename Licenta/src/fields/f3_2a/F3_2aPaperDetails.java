package fields.f3_2a;

import fields.Field;

public class F3_2aPaperDetails implements Field {

	private String value;

	public F3_2aPaperDetails(String value) {
		this.value = value;
	}

	@Override
	public void print() {
		System.out.println("F3_2aPaperDetails: " + value);
	}

}