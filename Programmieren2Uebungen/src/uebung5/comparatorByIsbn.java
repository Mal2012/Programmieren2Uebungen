package uebung5;

import java.util.Comparator;

public class comparatorByIsbn implements Comparator {
	@Override
	public int compare(Object o1, Object o2) {
		return ((Buch) o1).getIsbn().compareTo(((Buch) o2).getIsbn());
	}

}