package uebung2;

public class Wire implements Mobile {

	double laenge, knoten;
	Mobile m1, m2;

	public Wire(Mobile i1, Mobile i2, double l1) {

		this.m1 = i1;
		this.m2 = i2;
		this.laenge = l1;
	}

	@Override
	public double weight() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void balance() {
		// TODO Auto-generated method stub

	}

}
