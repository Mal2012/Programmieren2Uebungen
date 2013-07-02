package uebung9;

import java.util.Scanner;

public class Zahlen {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x1, x2, x3, x4, x5;

		System.out.println("Bitte 1. Zahl eingeben: ");
		x1 = sc.nextInt();
		System.out.println("Bitte 2. Zahl eingeben: ");
		x2 = sc.nextInt();
		System.out.println("Bitte 3. Zahl eingeben: ");
		x3 = sc.nextInt();
		System.out.println("Bitte 4. Zahl eingeben: ");
		x4 = sc.nextInt();
		System.out.println("Bitte 5. Zahl eingeben: ");
		x5 = sc.nextInt();
		int result = x1 + x2 + x3 + x4 + x5;
		System.out.println(x1 + "+" + x2 + "+" + x3 + "+" + x4 + "+" + x5 + "="
				+ result);

	}

}
