package fields.f3_3b;

import fields.Field;

public class F3_3bPaperDetails implements Field {

	private String value;

	public F3_3bPaperDetails(String value) {
		this.value = value;
	}

	@Override
	public void print() {
		System.out.println("F3_3bPaperDetails: " + value);
	}

}
