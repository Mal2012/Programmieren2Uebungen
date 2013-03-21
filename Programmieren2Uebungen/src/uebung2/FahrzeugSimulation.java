package uebung2;

public class FahrzeugSimulation {

	public static void main(String[] args) {

		LKW l1 = new LKW(0, 0, "LKW1");
		PKW p1 = new PKW(0, 0, "PKW1");
		PKW p2 = new PKW(0, 0, "PKW2");
		PKWOABS poa1 = new PKWOABS(0, 0, "PKWOABS1");

		System.out.println(l1);
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(poa1);
		System.out
				.println("-----------------------------------------------------------------------------------------------");
		l1.beschleunigen(30);
		p1.beschleunigen(15);
		p2.beschleunigen(15);
		poa1.beschleunigen(15);
		System.out.println(l1);
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(poa1);
		System.out
				.println("-----------------------------------------------------------------------------------------------");
		l1.fahren(20);
		p1.fahren(20);
		p2.fahren(20);
		poa1.fahren(20);
		System.out.println(l1);
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(poa1);

	}

}
