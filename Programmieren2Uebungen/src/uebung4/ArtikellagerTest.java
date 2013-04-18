package uebung4;

public class ArtikellagerTest {

	public static void main(String[] args) {
		Artikellager<Jacke> p = new Artikellager<Jacke>(5);
		Jacke j1 = new Jacke(10, null, null, 0);
		Jacke j2 = new Jacke(10, null, null, 0);
		Jacke j3 = new Jacke(10, null, null, 0);

		Jacke j4 = new Jacke(10, null, null, 0);
		p.einlagern(j1);
		p.einlagern(j2);
		p.einlagern(j3);
		p.einlagern(j4);
		System.out.println(p.bestandSuchen("77777710"));
	}
}
