package uebung2;

public class MobileTeset {
	public static void main(String[] args) {
		final Star a = new Star(2);
		final GlitterStar b = new GlitterStar(4);
		final Star c = new Star(9);
		final Wire ab = new Wire(a, b, 9);
		final Wire abc = new Wire(ab, c, 10);

		abc.balance();
		System.out.println(abc);
		b.decorate();
		b.decorate();
		b.decorate();
		System.out.println(abc);

		abc.balance();
		System.out.println(abc);

	}
}
