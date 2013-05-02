package uebung5;

public class BibTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Bibliothek b = new Bibliothek();
		Buch book = new Buch("Test", "isbn", "titel");
		Buch book2 = new Buch("uest2", "isbn2", "titel2");
		System.out.println(b);
		b.einfuegen(book2);
		b.einfuegen(book);
		System.out.println(b);
		comparatorByIsbn comp = new comparatorByIsbn();
		b.bestandSortierenNach(comp);
		System.out.println(b);
	}

}
