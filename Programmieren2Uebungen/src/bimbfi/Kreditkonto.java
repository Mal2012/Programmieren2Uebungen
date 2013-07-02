package bimbfi;

public class Kreditkonto extends Konto {
	protected int kontonummera;

	public Kreditkonto(int betrag) {
		kontostand = betrag;
		kontostandalt = betrag;
		this.kontonummera = kontonummer;
	}

	@Override
	protected void einzahlen(int betrag) {
		// TODO Auto-generated method stub
		if (kontostand + betrag <= 0) {
			kontostandalt = kontostand;
			kontostand += betrag;
		} else {
			new Exception("Kontostand >0");
		}
	}

	@Override
	protected void auszahlen(int betrag) {
		// TODO Auto-generated method stub
		new KontoException("Auszahlung nicht möglich");
	}

	@Override
	public String toString() {
		return "Kreditkonto: " + kontonummera + " [kontostand=" + kontostand
				+ "]";
	}
}
