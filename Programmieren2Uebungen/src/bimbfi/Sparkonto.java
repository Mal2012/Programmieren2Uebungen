package bimbfi;

public class Sparkonto extends Konto {

	protected int kontonummera;

	public Sparkonto() {
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
		if (kontostand - betrag >= 0) {
			kontostandalt = kontostand;
			kontostand -= betrag;
		} else {
			new KontoException("Überziehungsrahmen erreicht!");
		}
	}

	@Override
	public String toString() {
		return "Sparkonto: " + kontonummera + " [kontostand=" + kontostand
				+ "]";
	}
}
