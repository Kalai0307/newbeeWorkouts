package com.practice.patterns;

import java.util.Arrays;
import java.util.Scanner;

//10.40-10.52
public class RemoveDupliacteElementFromArrays {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
//		System.out.println("enter array size and array elemnts");
//
//		int n = sc.nextInt();
//		int a[] = new int[n];
//		a = gettingArrayInputs(a);
		int a[] = { 2, 2, 33, 66666, 9, 0, 0, 7, 5, 444 };
		boolean visited[] = new boolean[a.length];
		for (int i = 0; i < a.length; i++) {
			if (visited[i] == false) {
				for (int j = i + 1; j < a.length; j++) {
					if (a[i] == a[j]) {
						visited[j] = true;
					}
				}
			}
		}
		System.out.println();
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if (visited[i] == false) {
				count++;
			}
		}
		System.out.println("size   :" + count);

		int resultantArray[] = new int[count];
		resultantArray = result(resultantArray, visited, a);
		System.out.println("array element without duplicaes  :" + Arrays.toString(resultantArray));
	}

	private static int[] result(int[] resultantArray, boolean[] visited, int[] a) {
		int index = 0;
		for (int i = 0; i < visited.length; i++) {
			if (!visited[i]) {
				resultantArray[index] = a[i];
				index++;
			}
		}
		return resultantArray;
	}

	private static int[] gettingArrayInputs(int[] a) {
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		return a;
	}
}
