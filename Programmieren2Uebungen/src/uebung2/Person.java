package uebung2;

public class Person {
	private String vorname, nachname, strassenname, hausnummer, ort;
	private int plz, gehalt;

	public Person(String vorname, String nachname, String strassenname,
			String hausnummer, String ort, int plz, int gehalt) {
		super();
		this.vorname = vorname;
		this.nachname = nachname;
		this.strassenname = strassenname;
		this.hausnummer = hausnummer;
		this.ort = ort;
		this.plz = plz;
		this.gehalt = gehalt;
	}

	@Override
	public String toString() {
		return "Person []";

	}

	public String getHausnummer() {
		return hausnummer;
	}

	public void setHausnummer(String hausnummer) {
		this.hausnummer = hausnummer;
	}

	public String getVorname() {
		return vorname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	public String getNachname() {
		return nachname;
	}

	public void setNachname(String nachname) {
		this.nachname = nachname;
	}

	public String getStrassenname() {
		return strassenname;
	}

	public void setStrassenname(String strassenname) {
		this.strassenname = strassenname;
	}

	public String getOrt() {
		return ort;
	}

	public void setOrt(String ort) {
		this.ort = ort;
	}

	public int getPlz() {
		return plz;
	}

	public void setPlz(int plz) {
		this.plz = plz;
	}

	public int gehalt() {
		return gehalt;
	}

	public void setGehalt(int gehalt) {
		this.gehalt = gehalt;
	}

}
