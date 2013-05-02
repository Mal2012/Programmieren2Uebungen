package uebung5;

import java.util.Comparator;

public class comparatorByAutor implements Comparator {
	@Override
	public int compare(Object o1, Object o2) {
		return ((Buch) o1).getAutor().compareTo(((Buch) o2).getAutor());
	}

}
