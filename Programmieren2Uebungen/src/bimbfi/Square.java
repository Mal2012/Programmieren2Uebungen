package bimbfi;

public class Square {

	public static void main(String[] args) {
		int i;
		try {
			i = Integer.parseInt(args[0]);
			System.out.println(i * i);

		} catch (Exception e) {
			System.out.println("Ungültige Eingabe");
		}

	}
}
