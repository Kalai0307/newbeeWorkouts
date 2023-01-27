package com.practice.patterns;

import java.util.HashMap;
import java.util.Scanner;

/*
 * Input:  str1 = “aab”, str2 = “xxy”
Output: True
Explanation: ‘a’ is mapped to ‘x’ and ‘b’ is mapped to ‘y’.
Input:  str1 = “aab”, str2 = “xyz”
Output: False
Explanation: One occurrence of ‘a’ in str1 has ‘x’ in str2 and other occurrence of ‘a’ has ‘y’.
  
 */
public class IsomorphicCheck {

	public static void main(String[] args) {
		System.out.println("enter the String 1");
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		System.out.println("enter the String 2");
		String b = sc.next();
		HashMap<Character, Character> alphabets = new HashMap<Character, Character>();
		boolean check = isIsomorphic(a, b);
		System.out.println(check);

	}

	private static boolean isIsomorphic(String a, String b) {
		if (a.length() != b.length()) {
			return false;
		}
		boolean flag = true;
		HashMap<Character, Character> alphabets = new HashMap<Character, Character>();
		for (int i = 0; i < a.length(); i++) {

			if (alphabets.containsKey(a.charAt(i))) {
				if (b.charAt(i) != alphabets.get(a.charAt(i))) {
					return false;
				}
			} else {
				alphabets.put(a.charAt(i), b.charAt(i));
			}
		}
		return true;
	}

}
