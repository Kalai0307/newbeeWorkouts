package com.practice.patterns;

import java.util.Arrays;
import java.util.Scanner;

public class MajorityEmentIntheArray {
//3.28-3.41
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

//		System.out.println("enter array size and array elemnts");
//
//		int n = sc.nextInt();
//		int a[] = new int[n];
//		a = gettingArrayInputs(a);
		int a[] = { 1, 2, 3, 2, 2, 2, 2 };
		int maxValue = a.length / 2;
		System.out.println(" max vale " + maxValue);
		boolean[] visited = new boolean[a.length];
		int result = 0;
		boolean flag = false;
		for (int i = 0; i < a.length; i++) {
			int count = 1;
			if (visited[i] == false) {
				for (int j = i + 1; j < a.length; j++) {
					if (a[i] == a[j]) {
						count++;
						visited[j] = true;
					}
				}
				if (count > maxValue) {
					flag = true;
					result = a[i];
					maxValue = count;
				}
			}
		}
		if (flag)
			System.out.println("result   " + result);
		else {
			System.out.println("result  :" + -1 + " NO MAJORITY ELEMENT");
		}

	}

	private static int[] gettingArrayInputs(int[] a) {
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		return a;
	}
}
