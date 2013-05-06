package uebung5;

public class CountListTest {

	public static void main(String[] args) {
		CountList<Integer> cl = new CountList<Integer>();
		cl.add(1);
		cl.add(2);
		cl.add(2);
		cl.add(3);
		cl.add(2);
		cl.add(1);
		cl.add(4);

		System.out.println(cl.count(2));
		System.out.println(cl.unique());
		System.out.println(cl.counts());
	}
}
