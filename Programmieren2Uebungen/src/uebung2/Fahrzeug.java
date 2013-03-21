package uebung2;

public class Fahrzeug {
	private double position, geschwindigkeit;
	private final double hoechstgeschwind;
	private final double beschleunigung;
	private final String name;

	public Fahrzeug(double position, double geschwindigkeit,
			double hoechstgeschwind, double beschleunigung, String name) {
		super();
		this.position = position;
		this.geschwindigkeit = geschwindigkeit;
		this.hoechstgeschwind = hoechstgeschwind;
		this.beschleunigung = beschleunigung;
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
		return beschleunigung;

	}

	public double hoechstGeschwindigkeit() {
		return this.hoechstgeschwind;
	}

	@Override
	public String toString() {
		return "Fahrzeug [position=" + position + ", geschwindigkeit="
				+ geschwindigkeit + ", hoechstgeschwind=" + hoechstgeschwind
				+ ", beschleunigung=" + beschleunigung + ", name=" + name + "]";
	}
}
