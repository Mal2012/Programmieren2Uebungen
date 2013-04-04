package uebung3;

import java.util.StringTokenizer;
import java.util.Vector;

public class WordColl {
	Vector<Object> v = new Vector<Object>();

	public WordColl(String... chapter) {
		// TODO Auto-generated constructor stub

		for (String s : chapter) {

			StringTokenizer st = new StringTokenizer(s);
			while (st.hasMoreTokens()) {
				String ss = st.nextToken();

				this.v.add(new Word(ss));
			}
		}

	}

	public int size() {
		// TODO Auto-generated method stub
		return this.v.size();
	}

	public int count(Object s2) {
		// TODO Auto-generated method stub
		int result = 0;
		for (Object s : v) {
			if (s.toString().equals(s2.toString())) {
				result += 1;
			}
		}
		return result;

	}

	public String top() {
		// TODO Auto-generated method stub
		int c = 0;
		String res = null;
		for (Object s : this.v) {
			if (count(s) > c) {
				c = count(s);
				res = s.toString();
			}
		}
		return res;

	}

	public void append(String... string) {
		// TODO Auto-generated method stub
		for (String s : string) {

			StringTokenizer st = new StringTokenizer(s);
			while (st.hasMoreTokens()) {
				String ss = st.nextToken();
				this.v.add(ss);
			}
		}
	}

	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		int total = 0;
		for (Object s : v) {
			if (sb.indexOf(s.toString()) <= 0) {
				if (s.toString().length() >= 8) {
					sb.append(s + "			| " + count(s) + " \n");
				} else {
					sb.append(s + "				| " + count(s) + " \n");
				}
				total += count(s);
			}
		}
		return "Word				| count\n"
				+ "------------------------------------------------\n"
				+ sb.toString()
				+ "------------------------------------------------\n"
				+ "Total: " + total;
	}
}
