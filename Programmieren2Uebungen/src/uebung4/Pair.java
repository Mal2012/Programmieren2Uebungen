package uebung4;

public class Pair<E, K> {
	private E e;
	private K k;

	public Pair(E ee, K kk) {
		this.e = ee;
		this.k = kk;
	}

	public E getE() {
		return e;
	}

	public void setE(E e) {
		this.e = e;
	}

	public K getK() {
		return k;
	}

	public void setK(K k) {
		this.k = k;
	}

	@Override
	public String toString() {
		return "(" + e + "," + k + ")";
	}

	@Override
	public boolean equals(Object o) {
		if (o == null)
			return false;
		if (getClass() != o.getClass())
			return false;
		if (!super.equals(o))
			return false;
		final Pair other = (Pair) o;
		if (!helpEquals(e, other.getE()))
			return false;
		if (!helpEquals(k, other.getK()))
			return false;
		return true;
	}

	private static boolean helpEquals(final Object x, final Object y) {
		if (x == null)
			return y == null;
		return x.equals(y);
	}

	@Override
	public int hashCode() {
		int hash = 17;
		if (e != null)
			hash = 23 * hash + e.hashCode();
		if (k != null)
			hash = 23 * hash + k.hashCode();
		return hash;
	}
}
