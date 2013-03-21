package uebung2;

public class PersonTest {
	public static void main(String[] args) {
		Student aStudent = new Student("Peter", "Müller", "Hauptstrasse", "4a",
				96450, "Coburg", "455555", 1000);

		Dozent aDozent = new Dozent("Hans", "Meyer", "Jenaerstrasse", "21",
				96450, "Coburg", "Betriebssysteme", 1000);

		aDozent.setVorname("Hans");

		aStudent.drucken();
		aDozent.drucken();

		Person[] p = new Person[5];

		for (int i = 0; i < p.length; i++) {
			int zahl = (int) (Math.random() * 2);
			if (zahl == 0) {
				p[i] = new Student("Peter", "Müller", "Hauptstrasse", "4a",
						96450, "Coburg", "455555", i);
			} else {
				p[i] = new Dozent("Hans", "Meyer", "Jenaerstrasse", "21",
						96450, "Coburg", "Betriebssysteme", i);
			}
		}

		for (Person a : p) {
			if (a instanceof Student) {
				((Student) a).drucken();
				System.out.println(((Student) a).gehalt());
			} else {
				((Dozent) a).drucken();
				System.out.println(((Dozent) a).gehalt());
			}
		}

	}
}
