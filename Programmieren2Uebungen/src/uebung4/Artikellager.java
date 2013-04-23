package uebung4;

import java.util.Arrays;

public class Artikellager<E extends Artikel> {
	Ort<E>[] orte;

	@SuppressWarnings("unchecked")
	public Artikellager(int anzahlOrte) {
		this.orte = new Ort[anzahlOrte];
		for (int i = 0; i < anzahlOrte; i++) {
			orte[i] = new Ort<E>(i);
		}
	}

	public E auslagern(String artikelnummer) {
		for (Ort<E> o : orte) {
			if (o.istBelegt()) {

				if ((o.getEingelagertesElement()).artikelNummer().equals(
						artikelnummer)) {
					return o.entnehmen();
				}
			}
		}
		return null;
	}

	public boolean einlagern(E e) {
		for (Ort<E> o : orte) {
			if (!o.istBelegt()) {
				o.hinzufuegen(e);
				return true;
			}
		}
		return false;

	}

	public int bestandSuchen(String artikelnummer) {
		int result = 0;
		for (Ort<E> o : orte) {
			if (o.istBelegt()) {
				if (o.getEingelagertesElement().artikelNummer()
						.equals(artikelnummer)) {
					result++;
				}
			}
		}

		return result;

	}

	@Override
	public String toString() {
		return "Artikellager [orte=" + Arrays.toString(orte) + "]";
	}
}
