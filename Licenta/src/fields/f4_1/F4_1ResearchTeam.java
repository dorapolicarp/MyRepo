package fields.f4_1;

import fields.Field;

public class F4_1ResearchTeam implements Field {

	private String[] values;

	public F4_1ResearchTeam(String[] values) {
		this.values = values;
	}

	@Override
	public void print() {
		StringBuffer sb = new StringBuffer();
		sb.append("F4_1ResearchTeam: ");
		for (String s : values) {
			sb.append(s);
			sb.append(", ");
		}
		System.out.println(sb);
	}

}
