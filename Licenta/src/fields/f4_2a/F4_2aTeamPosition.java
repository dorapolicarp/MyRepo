package fields.f4_2a;

import fields.Field;

public class F4_2aTeamPosition implements Field {

	private String value;

	public F4_2aTeamPosition(String value) {
		this.value = value;
	}

	@Override
	public void print() {
		System.out.println("F4_2aTeamPosition: " + value);
	}

}
