package uebung9;

public class ArtikelverwaltungTest {
	public static void main(String[] args) {
		Artikelverwaltung a1 = new Artikelverwaltung();
		a1.create(10);
		a1.write("T1.txt");
		a1.read("T1.txt");
		a1.write("Test.txt");
	}
}
