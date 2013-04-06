package fields.f4_2a;

import fields.Field;

public class F4_2aResearchTeam implements Field {

	private String[] values;

	public F4_2aResearchTeam(String[] values) {
		this.values = values;
	}

	@Override
	public void print() {
		StringBuffer sb = new StringBuffer();
		sb.append("F4_2aResearchTeam: ");
		for (String s : values) {
			sb.append(s);
			sb.append(", ");
		}
		System.out.println(sb);
	}

}
