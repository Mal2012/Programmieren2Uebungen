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

	@Override
	public int compareTo(Karte k) {

		if (k.f.equals(this.f))
			return 0;

		if (k.f.ordinal() < this.f.ordinal())
			return 1;
		if (k.f.ordinal() > this.f.ordinal())
			return -1;

		return 0;
	}

	@Override
	public boolean equals(Object o) {
		if (o == null)
			return false;
		if (getClass() != o.getClass())
			return false;
		Karte other = (Karte) o;
		return this.w.equals(other.w) && this.f.equals(other.f);

	}

	@Override
	public int hashCode() {
		int hash = 17;
		if (w != null)
			hash = 23 * hash + w.hashCode();
		if (f != null)
			hash = 23 * hash + f.hashCode();
		return hash;
	}

}
