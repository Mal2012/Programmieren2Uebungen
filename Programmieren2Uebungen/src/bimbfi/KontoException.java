package bimbfi;

public class KontoException extends Exception {
	public KontoException() {
		super();
	}

	public KontoException(String s) {
		super(s);
		System.out.println(s);
	}

}
