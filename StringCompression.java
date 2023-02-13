package com.practice.patterns;

import java.util.Scanner;

/*
 * 2.15-2.32
 * aaabbcdd-->a3b2cd2
 * 
 */
public class StringCompression {

	public static void main(String[] args) {
		System.out.println(" enter the string");
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		String result = StringCompresstion(input);
		System.out.println(" result    :    " + result);

	}

	private static String StringCompresstion(String a) {

		String result = "";
		int i = 0;
		int j = 0;
		while (i < a.length()) {
			int count = 0;
			if (i == a.length() - 1) {
				result = result + a.charAt(i);
				break;
			} else if (a.charAt(i) == a.charAt(i + 1)) {
				for (j = i; j < a.length(); j++) {
					if (a.charAt(i) == a.charAt(j)) {
						count++;
					} else {
						break;
					}
				}
				if (count == 1) {
					result = result + a.charAt(i);
				} else {
					result = result + a.charAt(i) + count + "";
				}
				i = j;
			} else {
				result = result + a.charAt(i);
				i++;
			}

			//System.out.println(" anser " + result);
		}

		return result;
	}

}
