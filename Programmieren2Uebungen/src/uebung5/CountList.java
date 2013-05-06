package uebung5;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CountList<E> extends LinkedList<E> implements List<E> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public int count(E element) {
		Iterator<E> it = super.iterator();
		int result = 0;
		while (it.hasNext()) {
			if (it.next().equals(element)) {
				result++;
			}
		}
		return result;
	}

	public int unique() {
		Set<E> s = new HashSet<E>();
		Iterator<E> it = super.iterator();
		int result = 0;
		while (it.hasNext()) {
			if (s.add(it.next())) {
				result++;
			}
		}
		return result;
	}

	public Map<E, Integer> counts() {
		Map<E, Integer> map = new HashMap<E, Integer>();

		Iterator<E> it = super.iterator();
		while (it.hasNext()) {
			E element = it.next();
			map.put(element, this.count(element));
		}

		return map;

	}
}
