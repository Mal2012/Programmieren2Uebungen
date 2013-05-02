package uebung5;

import java.util.Comparator;

public class comparatorByTitle implements Comparator {
	@Override
	public int compare(Object o1, Object o2) {
		return ((Buch) o1).getTitel().compareTo(((Buch) o2).getTitel());
	}

}
