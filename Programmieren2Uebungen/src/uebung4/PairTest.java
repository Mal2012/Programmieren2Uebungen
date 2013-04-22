package uebung4;

import java.util.Vector;

public class PairTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Pair<String, Integer>> vector = new Vector<Pair<String, Integer>>();
		vector.add(new Pair<String, Integer>("I", 1));
		vector.add(new Pair<String, Integer>("V", 5));
		vector.add(new Pair<String, Integer>("C", 100));
		vector.add(new Pair<String, Integer>("II", 2));
		vector.add(new Pair<String, Integer>("IX", 9));
		Pair<String, Integer> p1 = new Pair<String, Integer>("Hallo", 42);
		Pair<String, Integer> p2 = new Pair<String, Integer>("Hallo", 42);
		System.out.println(p1.equals(p2));
		System.out.println(vector);
	}

}
