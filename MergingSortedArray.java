package com.practice.patterns;

import java.util.Scanner;

public class MergingSortedArray {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("enter the tow array size");
		int n = sc.nextInt();
		int m = sc.nextInt();
		int array1[] = new int[n];
		int array2[] = new int[m];
		// int array1[] = { 5,8,9};
//		int array2[] = { 4,7,8 };
//		int n = 4, m = 4;
		array1 = gettingInputArray(array1, n);
		array2 = gettingInputArray(array2, m);
		int resultantArray[] = new int[n + m];
		resultantArray = mergingArrays(resultantArray, array1, array2);
		for (int i = 0; i < resultantArray.length; i++) {
			System.out.println(resultantArray[i]);
		}

	}

	private static int[] mergingArrays(int[] resultantArray, int[] array1, int[] array2) {

		int i = 0;
		int j = 0;
		int k = 0;
		while (i != array1.length && j != array2.length) {

			if (array1[i] <= array2[j]) {
				resultantArray[k] = array1[i];
				i++;
				k++;
			} else if (array1[i] > array2[j]) {
				resultantArray[k] = array2[j];
				j++;
				k++;
			}

		}
		while (i != array1.length) {
			resultantArray[k] = array1[i];
			i++;
			k++;
		}
		while (j != array2.length) {
			resultantArray[k] = array2[j];
			j++;
			k++;
		}

		return resultantArray;
	}

	private static int[] gettingInputArray(int[] array, int n) {
		System.out.println("enter the array elements");
		for (int i = 0; i < n; i++) {
			array[i] = sc.nextInt();
		}

		return array;
	}

}
