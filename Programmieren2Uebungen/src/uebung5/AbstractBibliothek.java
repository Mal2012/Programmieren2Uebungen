package uebung5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Map;
import java.util.TreeMap;

public abstract class AbstractBibliothek {

	protected Collection<Buch> buecher;

	public boolean einfuegen(Buch b) {
		if (b != null)
			return buecher.add(b);
		else
			return false;

	}

	public Collection<Buch> sucheNachAutor(String autor) {
		LinkedList<Buch> buchListe = new LinkedList<Buch>();
		for (Buch b : buecher) {
			if (b.autor.equals(autor))
				buchListe.add(b);
		}
		return buchListe;

	}

	public Buch sucheNachISBN(String isbn) {

		for (Buch b : buecher) {
			if (b.isbn.equals(isbn))
				return b;
		}
		return null;

	}

	public Collection<Buch> bestandSortierenNach(Comparator<Buch> comp) {
		ArrayList<Buch> arr = new ArrayList<Buch>(buecher);
		Collections.sort(arr, comp);
		return arr;

	}

	public Map<String, Collection<Buch>> bestandNachAutorAuflisten() {
		Map<String, Collection<Buch>> map = new TreeMap<String, Collection<Buch>>();

		for (Buch b : buecher) {

			LinkedList<Buch> list = (LinkedList<Buch>) map.get(b.autor);
			if (list == null) {
				list = new LinkedList<Buch>();
			}
			list.add(b);
			map.put(b.autor, list);

		}

		return map;
	}

	@Override
	public String toString() {
		return "" + buecher.toString();
	}

	public Collection<Buch> getBuecher() {
		return buecher;
	}

}
