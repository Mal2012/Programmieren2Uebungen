package uebung1;
import java.util.Arrays;

public class Kartenspiel {

	private Karte[] karten;

	public Kartenspiel(int n) {
		karten = new Karte[n];
		for (int i = 0; i < karten.length; i++) {
			karten[i] = new Karte(
					Karte.Farbe.values()[(int) (Math.random() * Karte.Farbe
							.values().length)],
					Karte.Wert.values()[(int) (Math.random() * Karte.Wert
							.values().length)]);
		}
	}

	public void mischen() {
		for (int i = 0; i < karten.length; i++) {
			int ersteKarte = (int) (Math.random() * karten.length);
			int zweiteKarte = (int) (Math.random() * karten.length);

			if (!karten[ersteKarte].equals(karten[zweiteKarte])) {
				Karte temp = karten[ersteKarte];
				karten[ersteKarte] = karten[zweiteKarte];
				karten[zweiteKarte] = temp;
			}
		}
	}

	public void sortieren() {
		Arrays.sort(karten);
	}

	public void kartenspielHinzufuegen(Kartenspiel neu) {
		Karte[] original = this.karten;
		this.karten = new Karte[original.length + neu.karten.length];
		System.arraycopy(original, 0, karten, 0, original.length);
		System.arraycopy(neu.karten, 0, karten, original.length,
				neu.karten.length);

	}

	@Override
	public String toString() {
		return "Kartenspiel [karten=" + Arrays.toString(karten) + "]";
	}

}
