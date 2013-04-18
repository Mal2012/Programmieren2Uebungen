package uebung4;

public class Ort<E> {
	private int ortsID;
	private E element;

	public Ort(int ortsId) {
		setOrtsID(ortsId);
	}

	public int getOrtsID() {
		return ortsID;
	}

	public void setOrtsID(int ortsID) {
		this.ortsID = ortsID;
	}

	public E getElement() {
		return element;
	}

	public void setElement(E element) {
		this.element = element;
	}

	public E entnehmen() {
		E temp = getElement();
		setElement(null);
		return temp;
	}

	public void hinzufuegen(E e) {
		if (!istBelegt()) {
			setElement(e);
		}
	}

	public E getEingelagertesElement() {
		return getElement();
	}

	public boolean istBelegt() {
		boolean result = false;
		if (getElement() != null) {
			result = true;
		}
		return result;
	}

	@Override
	public String toString() {
		return "Ort [ortsID=" + ortsID + ", element=" + element + "]";
	}

}
