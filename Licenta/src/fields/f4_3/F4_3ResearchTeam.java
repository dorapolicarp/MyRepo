package fields.f4_3;

import fields.Field;

public class F4_3ResearchTeam implements Field {
	private String[] values;

	public F4_3ResearchTeam(String[] values) {
		this.values = values;
	}

	@Override
	public void print() {
		StringBuffer sb = new StringBuffer();
		sb.append("F4_3ResearchTeam: ");
		for (String s : values) {
			sb.append(s);
			sb.append(", ");
		}
		System.out.println(sb);
	}

}
