package uebung2;

public class Dozent extends Person {
	private final String lehrgebiet;

	public Dozent(String vorname, String nachname, String strassenname,
			String hausnummer, int plz, String ort, String lehrgebiet,
			int gehalt) {
		super(vorname, nachname, strassenname, hausnummer, ort, plz, gehalt);
		this.lehrgebiet = lehrgebiet;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Dozent [vorname=" + getVorname() + ", nachname="
				+ getNachname() + ", strassenname=" + getStrassenname()
				+ ", hausnummer=" + getHausnummer() + ", ort=" + getOrt()
				+ ", lehrgebiet=" + lehrgebiet + ", plz=" + getPlz()
				+ ", gehalt=" + gehalt() + "]";
	}

	public void drucken() {
		System.out.println("Dozent [vorname=" + getVorname() + ", nachname="
				+ getNachname() + ", strassenname=" + getStrassenname()
				+ ", hausnummer=" + getHausnummer() + ", ort=" + getOrt()
				+ ", lehrgebiet=" + lehrgebiet + ", plz=" + getPlz()
				+ ", gehalt=" + gehalt() + "]");
	}

}
