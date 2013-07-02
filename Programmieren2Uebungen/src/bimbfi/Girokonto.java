package bimbfi;

public class Girokonto extends Konto {

	protected int maxbetrag = -100;
	protected KontoView view;

	public Girokonto() {
		this.kontonummera = kontonummer;
		this.view = new KontoView(this);
	}

	@Override
	protected void einzahlen(int betrag) {
		// TODO Auto-generated method stub
		kontostandalt = kontostand;
		kontostand += betrag;
		super.setChanged();
		super.notifyObservers();
	}

	@Override
	protected void auszahlen(int betrag) {
		// TODO Auto-generated method stub
		if (kontostand - betrag >= maxbetrag) {
			kontostandalt = kontostand;
			kontostand -= betrag;
			super.setChanged();
			super.notifyObservers();
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
