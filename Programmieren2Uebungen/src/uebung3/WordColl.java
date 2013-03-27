package uebung3;

import java.util.StringTokenizer;
import java.util.Vector;

public class WordColl {
	Vector<String> v = new Vector<String>();

	public WordColl(String... chapter) {
		// TODO Auto-generated constructor stub

		for (String s : chapter) {

			StringTokenizer st = new StringTokenizer(s);
			while (st.hasMoreTokens()) {
				String ss = st.nextToken();
				this.v.add(ss);
			}
		}

	}

	public int size() {
		// TODO Auto-generated method stub
		return this.v.size();
	}

	public int count(String string) {
		// TODO Auto-generated method stub
		int result = 0;
		for (String s : v) {
			if (s.equals(string)) {
				result += 1;
			}
		}
		return result;

	}

	public String top() {
		// TODO Auto-generated method stub
		int c = 0;
		String res = null;
		for (String s : this.v) {
			if (count(s) > c) {
				c = count(s);
				res = s;
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
		for (String s : v) {
			if (s.length() >= 8) {
				sb.append(s + "			| " + count(s) + " \n");
			} else {
				sb.append(s + "				| " + count(s) + " \n");
			}
			total += count(s);
		}
		return "Word				| count\n"
				+ "------------------------------------------------\n"
				+ sb.toString()
				+ "------------------------------------------------\n"
				+ "Total: " + total;
	}
}
