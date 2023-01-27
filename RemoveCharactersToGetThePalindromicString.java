package com.practice.patterns;

import java.util.Scanner;

//12.09--12.15
/* Input : aebcbda
Output : 2
Remove characters 'e' and 'd'
Resultant string will be 'abcba'
which is a palindromic string

Input : geeksforgeeks
Output : 8

 */
public class RemoveCharactersToGetThePalindromicString {

	public static void main(String[] args) {
		System.out.println("enter the String");
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		int noOFCharctersToBeRemoved = removeCharcters(input);
		System.out.println(noOFCharctersToBeRemoved);

	}

	private static int removeCharcters(String input) {
		int count = 0;
		int start = 0;
		int end = input.length() - 1;
		for (int i = 0; i < input.length() / 2; i++) {
			if (input.charAt(start) != input.charAt(end)) {
				count = count + 2;
			}
			start++;
			end--;

		}
		return count;
	}

}
