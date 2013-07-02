package bimbfi;

public class Sparkonto extends Konto {

	protected KontoView view;

	public Sparkonto() {
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
		if (kontostand - betrag >= 0) {
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
		return "Sparkonto: " + kontonummera + " [kontostand=" + kontostand
				+ "]";
	}
}
