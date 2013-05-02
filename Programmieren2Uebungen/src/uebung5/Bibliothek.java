package uebung5;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;

public class Bibliothek {
	LinkedList bib = new LinkedList();

	public boolean einfuegen(Buch b) {
		bib.add(b);
		return true;

	}

	public Collection<Buch> sucheNachAutor(String autor) {
		Collection<Buch> b = null;
		for (Iterator<Buch> it = bib.iterator(); it.hasNext();) {
			Buch buk = it.next();
			if (buk.autor.equals(autor)) {
				b.add(buk);
			}
		}
		return b;
	}

	public Buch sucheNachIsbn(String isbn) {
		Buch b = null;
		for (Iterator<Buch> it = bib.iterator(); it.hasNext();) {
			Buch buk = it.next();
			if (buk.isbn.equals(isbn)) {
				b = buk;
			}
		}
		return b;
	}

	public Collection<Buch> bestandSortierenNach(Comparator<Buch> comp) {
		Collections.sort(bib, comp);
		return bib;
	}

	@Override
	public String toString() {
		return "Bibliothek [bib=" + bib + "]";
	}

}
