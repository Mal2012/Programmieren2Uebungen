package uebung2;

public class Star implements Mobile {
	double weight;

	public Star(double gewicht) throws IllegalArgumentException {
		if (gewicht < 0) {
			throw new IllegalArgumentException();
		}
		this.weight = gewicht;
		// TODO Auto-generated constructor stub
	}

	@Override
	public double weight() {
		// TODO Auto-generated method stub
		return this.weight;
	}

	@Override
	public void balance() {
		// TODO Auto-generated method stub

	}

	@Override
	public String toString() {
		return "Star [weight=" + weight + "]";
	}

}
