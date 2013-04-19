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

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
