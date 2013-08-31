package bimbfi;

public class KontoTest {
	public static void main(String[] args) {
		Girokonto g1 = new Girokonto();
		Kreditkonto k2 = new Kreditkonto(-1000);
		Sparkonto s1 = new Sparkonto();
		g1.einzahlen(100);
		s1.einzahlen(100);
		k2.einzahlen(100);
	}
}
