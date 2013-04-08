package uebung3;

import java.util.Stack;

public class Palindrome {

	public boolean testPalindrome(String s) {
		boolean result = false;
		Stack<Character> stack = new Stack<Character>();
		char[] chr = s.toCharArray();

		for (int i = 0; i < chr.length; i++) {
			if (i < chr.length / 2) {
				stack.add(chr[i]);
			} else {
				if (stack.peek().equals(chr[i])) {
					stack.pop();
					result = true;
				}
			}

		}

		return result;

	}
}
