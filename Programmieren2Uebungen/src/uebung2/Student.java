package uebung2;

public class Student extends Person {
	private final String matrikelnummer;

	public Student(String vname, String nname, String strasse, String hnummer,
			int plz, String stadt, String matrikelnummer, int gehalt) {
		super(vname, nname, strasse, hnummer, stadt, plz, gehalt);
		this.matrikelnummer = matrikelnummer;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Student [vorname=" + getVorname() + ", nachname="
				+ getNachname() + ", strassenname=" + getStrassenname()
				+ ", hausnummer=" + getHausnummer() + ", ort=" + getOrt()
				+ ", matrikelnummer=" + matrikelnummer + ", plz=" + getPlz()
				+ ", gehalt=" + gehalt() + "]";
	}

	public void drucken() {
		System.out.println("Student [vorname=" + getVorname() + ", nachname="
				+ getNachname() + ", strassenname=" + getStrassenname()
				+ ", hausnummer=" + getHausnummer() + ", ort=" + getOrt()
				+ ", matrikelnummer=" + matrikelnummer + ", plz=" + getPlz()
				+ ", gehalt=" + gehalt() + "]");
	}

}
