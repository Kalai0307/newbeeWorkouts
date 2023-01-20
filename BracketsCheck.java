package com.practice.patterns;

import java.util.Scanner;

public class BracketsCheck {

	public static void main(String[] args) {
		System.out.println("enter the String");
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		int t = 0, s = 0, p = 0;
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == '(') {
				t++;
			} else if (input.charAt(i) == ')') {
				t--;
			} else if (input.charAt(i) == '{') {
				s++;
			} else if (input.charAt(i) == '}') {
				s--;
			} else if (input.charAt(i) == '[') {
				p++;
			} else if (input.charAt(i) == ']') {
				p--;
			}
		}
		if (t == 0 && s == 0 && p == 0) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}

	}

}
