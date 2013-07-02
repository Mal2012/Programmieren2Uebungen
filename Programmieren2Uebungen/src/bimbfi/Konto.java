package bimbfi;

import java.util.Observable;

public abstract class Konto extends Observable {

	protected static int kontonummer = 1000000;
	protected int kontostand;
	protected int kontostandalt;
	protected int kontonummera;

	protected abstract void einzahlen(int betrag);

	protected abstract void auszahlen(int betrag);

	public Konto() {

		kontonummer++;
		kontostand = 0;
		kontostandalt = 0;
	}

	protected int getKontoStand() {
		return kontostand;
	}

	protected int getKontoNummer() {
		return kontonummera;
	}

	protected void undoLastOperation() {
		kontostand = kontostandalt;
	}

}
