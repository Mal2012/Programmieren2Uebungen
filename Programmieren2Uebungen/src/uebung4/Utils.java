package uebung4;

public class Utils {

	/**
	 * @param args
	 */

	public static <T> T noNull(T... args) {
		for (T element : args) {
			if (element != null) {
				return element;
			}
		}

		return null;

	}

	public static <T> void print(T... args) {
		System.out.print("[");
		for (int i = 0; i < args.length; i++) {
			System.out.print(args[i]);
			if (i != args.length - 1)
				System.out.print(", ");
		}
		System.out.println("]");

	}

	public static <T extends Comparable> void sortiere(T... args) {
		for (int i = 1; i < args.length; i++) {
			for (int j = 0; j < args.length - 1; j++) {
				if (args[j].compareTo(args[j + 1]) > 0) {
					T temp = args[j];
					args[j] = args[j + 1];
					args[j + 1] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] keys = { 2000, 2, 99, 756, 999, 0, 666, 2345, 7492, 22 };
		String[] article = { "the", "a ", "one ", "some ", "anton", "ymca" };

		Utils.print(keys); // [2000,2,99,756,999,0,666,2345,7492,22]
		Utils.print(article); // [the,a,one,some,anton,ymca]

		Utils.sortiere(keys);
		Utils.print(keys);
	}

}
