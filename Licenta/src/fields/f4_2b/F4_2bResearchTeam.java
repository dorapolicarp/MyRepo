package fields.f4_2b;

import fields.Field;

public class F4_2bResearchTeam implements Field {
	private String[] values;

	public F4_2bResearchTeam(String[] values) {
		this.values = values;
	}

	@Override
	public void print() {
		StringBuffer sb = new StringBuffer();
		sb.append("F4_2bResearchTeam: ");
		for (String s : values) {
			sb.append(s);
			sb.append(", ");
		}
		System.out.println(sb);
	}

}
