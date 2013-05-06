package uebung5;

import java.util.Collection;
import java.util.Vector;

public class Model {
	AbstractBibliothek bib = new BibliothekList();
	static String[][] bestand = {
			{ "9784898645133", "Reinhard Schiedermeier", "Java Praktikum" },
			{ "01303451517", "Harvey Deitel", "How to program Java" },
			{ "0136290310", "Bertrand Meyer",
					"Object Oriented Software Construction" },
			{ "9783642018558", "Bertrand Meyer",
					"Software Engineering Approaches for Offshore and Outsourced Development" },
			{ "9783897214484", "Kathy Sierra", "Java von Kopf bis Fuss" } };

	public void initiate() {

		int KOPIEN = 2;
		Buch b = null;

		for (int j = 0; j < KOPIEN; j++) {
			for (int i = 0; i < bestand.length; i++) {

				if (j == 0) {
					String isbn = bestand[i][0];
					String autor = bestand[i][1];
					String titel = bestand[i][2];
					b = new Buch(isbn, autor, titel);
				} else {
					b = bib.sucheNachISBN(bestand[i][0]);

				}
				bib.einfuegen(b);
			}
		}
		b = new Buch("9780123725011", "Mark Utting",
				"Pratical Model based Testing");
		bib.einfuegen(b);
	}

	public Vector makeVektor(Collection<Buch> collection) {
		Vector result = new Vector();
		for (Buch b : collection) {

			result.add(b);

		}
		return result;
	}
}