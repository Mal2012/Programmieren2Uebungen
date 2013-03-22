package uebung2;

public class GlitterStar extends Star {

	public GlitterStar(double gewicht) throws IllegalArgumentException {
		super(gewicht);
	}

	public void decorate() {
		super.weight += 1;
	}

	@Override
	public String toString() {
		return "GlitterStar [weight=" + weight + "]";
	}

}
