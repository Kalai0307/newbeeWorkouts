package com.practice.patterns;

import java.util.Arrays;
import java.util.Scanner;

//10.34-10.40
public class ArrayLeftRotation {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

//		System.out.println("enter array size and array elemnts");
//
//		int n = sc.nextInt();
//		int a[] = new int[n];
//		a = gettingArrayInputs(a);
		int a[] = { 1, 2, 3, 4, 5, 6, 7 };
		System.out.println("enter number of positions");
		int pos = sc.nextInt();
		while (pos > 0) {
			int temp = a[0];
			for (int i = 0; i < a.length - 1; i++) {
				a[i] = a[i + 1];
			}
			a[a.length - 1] = temp;
			pos--;

		}
		System.out.println(Arrays.toString(a));
	}

	private static int[] gettingArrayInputs(int[] a) {
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		return a;
	}

}
