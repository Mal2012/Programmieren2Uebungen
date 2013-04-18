package uebung4;

import java.util.Arrays;

public class Artikellager<E> {
	Ort<E>[] orte;

	public Artikellager(int anzahlOrte) {
		this.orte = new Ort[anzahlOrte];
		for (int i = 0; i < anzahlOrte; i++) {
			orte[i] = new Ort(i);
		}
	}

	public E auslagern(String artikelnummer) {
		for (Ort o : orte) {
			if (o.istBelegt()) {
				Artikel element = (Artikel) o.getEingelagertesElement();
				if (element.artikelNummer().equals(artikelnummer)) {
					return (E) o.entnehmen();
				}
			}
		}
		return null;
	}

	public boolean einlagern(E e) {
		for (Ort o : orte) {
			if (!o.istBelegt()) {
				o.hinzufuegen(e);
				return true;
			}
		}
		return false;

	}

	public int bestandSuchen(String artikelnummer) {
		int result = 0;
		for (Ort o : orte) {
			if (o.istBelegt()) {
				Artikel element = (Artikel) o.getEingelagertesElement();
				if (element.artikelNummer().equals(artikelnummer)) {
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
