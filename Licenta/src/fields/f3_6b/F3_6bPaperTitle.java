package fields.f3_6b;

import fields.Field;

public class F3_6bPaperTitle implements Field {

	private String value;

	public F3_6bPaperTitle(String value) {
		this.value = value;
	}

	@Override
	public void print() {
		System.out.println("F3_6bPaperTitle: " + value);
	}

}
