package uebung2;

public class Fahrzeug {
	private double position, geschwindigkeit;
	private final double hoechstgeschwind;
	private final double beschleunigung;
	private double ladung;
	private final double maxLadung;
	private final String name;
	private final double bremswertpkw, bremswertlkw;
	private double bremsladung;

	public Fahrzeug(double position, double geschwindigkeit,
			double hoechstgeschwind, double beschleunigung, double ladung,
			double maxladung, double bremswertpkw, double bremswertlkw,
			double bremsladung, String name) {
		super();
		this.position = position;
		this.geschwindigkeit = geschwindigkeit;
		this.hoechstgeschwind = hoechstgeschwind;
		this.beschleunigung = beschleunigung;
		this.ladung = ladung;
		this.maxLadung = maxladung;
		this.bremswertpkw = bremswertpkw;
		this.bremswertlkw = bremswertlkw;
		this.bremsladung = bremsladung;
		this.name = name;
	}

	public double beschleunigen(double sekunden) {
		double t = (this.hoechstgeschwind / 3.6) / this.beschleunigung;
		if (sekunden - t > 0.0) {
			geschwindigkeit = this.hoechstgeschwind;
			position = position + (1.0 / 2.0 * this.beschleunigung * t * t)
					/ 1000.0;
			fahren(((sekunden - t) / 60.0));
		} else {
			geschwindigkeit = (this.beschleunigung * sekunden) * 3.6;
			position = position
					+ ((1.0 / 2.0 * this.beschleunigung * sekunden * sekunden) / 1000.0);
		}

		return position;

	}

	public double fahren(double minuten) {
		position = position + (minuten / 60) * geschwindigkeit;
		return position;

	}

	public double stoppen() {
		double s = (this.bremswertpkw * ((this.geschwindigkeit / 3.6) / 10) * ((this.geschwindigkeit / 3.6) / 10))
				+ (this.bremswertlkw * (((this.geschwindigkeit / 3.6) * (this.geschwindigkeit / 3.6)) / this.bremsladung))
				+ ((this.geschwindigkeit / 3.6) / 10) * 3;

		this.position = position + (s / 1000);
		this.geschwindigkeit = 0.0;
		return beschleunigung;

	}

	public double hoechstGeschwindigkeit() {
		return this.hoechstgeschwind;
	}

	void beladen(double ladungintonnen) {
		if (this.ladung + ladungintonnen <= this.maxLadung) {
			this.ladung += ladungintonnen;
		} else {
			this.ladung += this.maxLadung;
		}
		if (this.istVollBeladen()) {
			this.bremsladung = 3.0;
		} else {
			this.bremsladung = 5.0;
		}
	}

	void entbeladen(double ladungintonnen) {
		if (this.ladung - ladungintonnen >= 0) {
			this.ladung -= ladungintonnen;
		} else {
			this.ladung = 0;
		}
		if (this.istVollBeladen()) {
			this.bremsladung = 3.0;
		} else {
			this.bremsladung = 5.0;
		}
	}

	boolean istVollBeladen() {
		if (this.ladung == this.maxLadung) {
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return "Fahrzeug [position=" + position + ", geschwindigkeit="
				+ geschwindigkeit + ", hoechstgeschwind=" + hoechstgeschwind
				+ ", beschleunigung=" + beschleunigung + ", name=" + name + "]";
	}
}
