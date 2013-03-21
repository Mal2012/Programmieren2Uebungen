package uebung1;
import java.util.Arrays;

public class Sortieren {

	private final int[] a;

	public Sortieren(int[] input) {
		this.a = input;
	}

	public int[] sortiere() {
		Arrays.sort(a);
		return a;
	}

	public String toString() {
		return "Sortieren [a="
				+ (a != null ? arrayToString(a, a.length) : null) + "]";
	}

	private String arrayToString(Object array, int len) {
		StringBuffer buffer = new StringBuffer();
		buffer.append("[");
		for (int i = 0; i < len; i++) {
			if (i > 0)
				buffer.append(", ");
			if (array instanceof int[])
				buffer.append(((int[]) array)[i]);
		}
		buffer.append("]");
		return buffer.toString();
	}
}
