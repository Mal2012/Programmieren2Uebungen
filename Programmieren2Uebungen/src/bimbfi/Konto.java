package bimbfi;

public abstract class Konto {

	protected static int kontonummer = 1000000;
	protected int kontostand;
	protected int kontostandalt;

	protected abstract void einzahlen(int betrag);

	protected abstract void auszahlen(int betrag);

	public Konto() {
		kontonummer++;
		kontostand = 0;
		kontostandalt = 0;
	}

	protected void undoLastOperation() {
		kontostand = kontostandalt;
	}

}
