package uebung3;

import java.util.StringTokenizer;

public class WordCollohneVector {
	String[] collection;

	public WordCollohneVector(String... chapter) {
		this.collection = chapter;
	}

	public int size() {
		int result = 0;
		for (int i = 0; i < this.collection.length; i++) {
			StringTokenizer st = new StringTokenizer(collection[i]);
			while (st.hasMoreTokens()) {
				st.nextToken();
				result += 1;
			}
		}

		return result;

	}

	public int count(String s) {
		int result = 0;
		for (int i = 0; i < this.collection.length; i++) {
			StringTokenizer st = new StringTokenizer(collection[i]);
			while (st.hasMoreTokens()) {
				if (st.nextToken().equals(s)) {

					result += 1;
				}
			}
		}

		return result;
	}

	public void append(String... chapter) {

		String[] temp = this.collection;
		this.collection = new String[temp.length + chapter.length];
		System.arraycopy(temp, 0, this.collection, 0, temp.length);
		System.arraycopy(chapter, 0, this.collection, temp.length,
				chapter.length);
	}

	public String top() {
		int c = 0;
		String res = null;
		for (int i = 0; i < this.collection.length; i++) {
			StringTokenizer st = new StringTokenizer(this.collection[i]);
			while (st.hasMoreTokens()) {
				String string = st.nextToken();
				if (count(string) > c) {
					c = count(string);
					res = string;
				}
			}

		}

		return res;
	}

	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		int total = 0;
		for (int i = 0; i < this.collection.length; i++) {
			StringTokenizer st = new StringTokenizer(this.collection[i]);

			while (st.hasMoreTokens()) {
				String s = st.nextToken();
				sb.append(s + "				| " + count(s) + " \n");
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
