package uebung1;
public class KartenspielTest {
	public static void main(String[] args) {
		Kartenspiel k = new Kartenspiel(5);
		System.out.println(k);
		k.mischen();
		System.out.println(k);
		k.sortieren();
		System.out.println(k);

		Kartenspiel k2 = new Kartenspiel(6);
		System.out.println(k2);

		k.kartenspielHinzufuegen(k2);

		System.out.println(k);
		System.out.println(k2);
	}
}
