package uebung4;

public class JeansLagerTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Artikellager<Jeans> jeansLager = new Artikellager<Jeans>(10);

		Jeans j1 = new Jeans(36, Kleidungsstueck.Farbe.ROT, "Jeans Levis 502",
				36);
		Jeans j2 = new Jeans(36, Kleidungsstueck.Farbe.ROT, "Jeans Levis 502",
				36);

		jeansLager.einlagern(j1);
		jeansLager.einlagern(j2);

		System.out.println(jeansLager.bestandSuchen("56740736"));
		// 2

		Jeans j = jeansLager.auslagern("56740736");

		System.out.println(jeansLager.bestandSuchen("56740736"));
		// 1
	}
}
