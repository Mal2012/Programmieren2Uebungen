package uebung3;

public class WordCollTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] chapter = { "Thomas Mann , der j�ngere Bruder von Heinrich Mann (1871�1950) n" };

		WordColl wColl = new WordColl(chapter);
		System.out.println(wColl.size()); // liefert 9.
		System.out.println(wColl.count("Mann")); // liefert 2
		System.out.println(wColl);
		wColl.append("Mann", "Test");
		System.out.println(wColl);
		System.out.println(wColl.top());
	}
}
