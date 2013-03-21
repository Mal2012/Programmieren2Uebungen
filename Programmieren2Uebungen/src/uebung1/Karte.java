package uebung1;
public class Karte implements Comparable<Karte> {

	enum Farbe {
		KARO, HERZ, PIK, KREUZ
	};

	enum Wert {
		SIEBEN, ACHT, NEUN, ZEHN, BUBE, DAME, KOENIG, ASS
	};

	private final Farbe f;
	private final Wert w;

	public Karte(Farbe f, Wert w) {
		this.f = f;
		this.w = w;
	}

	@Override
	public String toString() {
		return f.toString() + w.toString();
	}

	public int compareTo(Karte k) {

		if (k.f.equals(this.f))
			return 0;

		if (k.f.ordinal() < this.f.ordinal())
			return 1;
		if (k.f.ordinal() > this.f.ordinal())
			return -1;

		return 0;
	}

}
