package bimbfi;

public class Girokonto extends Konto {
	protected int kontonummera;
	protected int maxbetrag = -100;

	public Girokonto() {
		this.kontonummera = kontonummer;
	}

	@Override
	protected void einzahlen(int betrag) {
		// TODO Auto-generated method stub
		kontostandalt = kontostand;
		kontostand += betrag;
	}

	@Override
	protected void auszahlen(int betrag) {
		// TODO Auto-generated method stub
		if (kontostand - betrag >= maxbetrag) {
			kontostandalt = kontostand;
			kontostand -= betrag;
		} else {
			new KontoException("Überziehungsrahmen erreicht!");
		}
	}

	@Override
	public String toString() {
		return "Girokonto: " + kontonummera + " [kontostand=" + kontostand
				+ ", Überziehungsrahmen=" + maxbetrag + "]";
	}
}
