package uebung8;

import java.io.IOException;

public class Calculator_Run {

	public static void main(String[] args) {
		// Calculator c = new Calculator();
		try {
			Runtime.getRuntime().exec("C:/Windows/system32/calc.exe");

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
