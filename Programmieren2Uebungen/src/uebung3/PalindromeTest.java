package uebung3;

import java.util.Scanner;

public class PalindromeTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Palindrome p = new Palindrome();
		Scanner sc = new Scanner(System.in);
		String s = sc.next();

		System.out.println(p.testPalindrome(s));

	}
}
