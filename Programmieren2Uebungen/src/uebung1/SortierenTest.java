package uebung1;
public class SortierenTest {
	public static void main(String[] args) {
		int[] input = { 2000, 2, 45, 34, 100000, 345, 56, 78, 99, 756, 999, 0,
				666, 2345, 7492, 22 };

		Sortieren sa = new Sortieren(input);
		System.out.println("Orginal-Reihenfolge");
		System.out.println(sa);
		sa.sortiere();
		System.out.println("Sortierte-Reihenfolge");
		System.out.println(sa);

	}
}
