package uebung2;

public class Wire implements Mobile {

	double laenge, abstand1, abstand2;
	Mobile m1, m2;

	public Wire(Mobile i1, Mobile i2, double l1) {

		this.m1 = i1;
		this.m2 = i2;
		this.laenge = l1;
		this.abstand1 = 0;
		this.abstand2 = l1;
	}

	@Override
	public double weight() {
		// TODO Auto-generated method stub
		return this.m1.weight() + this.m2.weight();
	}

	@Override
	public void balance() {
		// TODO Auto-generated method stub
		m1.balance();
		m2.balance();
		final double w1 = m1.weight();
		final double w2 = m2.weight();
		final double length = abstand1 + abstand2;
		abstand1 = w2 * length / (w1 + w2);
		abstand2 = w1 * length / (w1 + w2);
	}

	@Override
	public String toString() {
		return "Wire [laenge=" + laenge + ", abstand1=" + abstand1
				+ ", abstand2=" + abstand2 + ", m1=" + m1 + ", m2=" + m2 + "]";
	}

}
