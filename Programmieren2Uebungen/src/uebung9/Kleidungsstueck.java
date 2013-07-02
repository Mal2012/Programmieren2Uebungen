package uebung9;

public abstract class Kleidungsstueck implements Artikel {
	enum Farbe {
		SCHWARZ, GRÜN, ROT, BLAU, GRAU
	};

	protected final int groesse;
	protected final Farbe farbe;
	protected final String bezeichnung;
	protected String artNr;

	protected Kleidungsstueck(int groesse, Farbe f, String bezeichnung) {
		this.farbe = f;
		this.groesse = groesse;
		this.bezeichnung = bezeichnung;
	}

	@Override
	public String bezeichnung() {
		return this.bezeichnung;
	}

	public int getGroesse() {
		return groesse;
	}

	public Farbe getFarbe() {
		return farbe;
	}

	@Override
	public String toString() {
		return "" + bezeichnung + " " + groesse + " " + farbe;

	}

}
