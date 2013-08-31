package bimbfi;

public class BinNode<T> {
	T val;
	BinNode<T> left, right;

	public BinNode(T val, BinNode<T> left, BinNode<T> right) {
		this.val = val;
		this.left = left;
		this.right = right;
	}

	public BinNode(T val) {
		this.val = val;
		this.left = null;
		this.right = null;
	}

	public T max() {
		if (this.right == null) {
			return val;
		} else {
			return this.right.max();
		}
	}

}

public class Test {
	public static void main(String[] args) {
		BinNode<Integer> n1 = new BinNode<Integer>(5);
		BinNode<Integer> n2 = new BinNode<Integer>(1);
		BinNode<Integer> n3 = new BinNode<Integer>(3, n2, n1);
		System.out.println(n3.max());
	}
}