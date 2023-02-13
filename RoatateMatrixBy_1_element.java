package com.practice.patterns;

import java.util.Arrays;

/*
 * int a[][] = { {1, 2, 3, 4},
                  {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16} };
 *  output:
 *   5 1 2 3 
    9 10 6 4 
    13 11 7 8 
    14 15 16 12 
 */
public class RoatateMatrixBy_1_element {

	public static void main(String[] args) {

		int a[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
		spiralMatrix(a);
		rotateByOne(a);

	}

	private static void rotateByOne(int[][] a) {
		int r1 = 0;
		int r2 = a.length - 1;
		int c1 = 0;
		int c2 = a[0].length - 1;
		int i = 0;
		int prev = 0;
		int curr = 0;
		while (r1 < r2 && c1 < c2) {
			if (r1 == r2 + 1 || c1 == c2 + 1) {
				break;
			}
			prev = a[r1 + 1][c1];
			for (i = c1; i <= c2; i++) {
				curr = a[r1][i];
				a[r1][i] = prev;
				prev = curr;
			}
			r1++;
			for (i = r1; i <= r2; i++) {
				curr = a[i][c2];
				a[i][c2] = prev;
				prev = curr;
			}
			c2--;
			if (r1 <= r2) {
				for (i = c2; i >= c1; i--) {
					curr = a[r2][i];
					a[r2][i] = prev;
					prev = curr;

				}
				r2--;
			}
			if (c1 <= c2) {
				for (i = r2; i >= r1; i--) {
					curr = a[i][c1];
					a[i][c1] = prev;
					prev = curr;
				}
				c1++;
			}
		}
		System.out.println(" ROTATE BY ONE ELEMENT   ");
		for (i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}

	}

	private static void spiralMatrix(int[][] a) {
		int r1 = 0;
		int r2 = a.length - 1;
		int c1 = 0;
		int c2 = a[0].length - 1;
		int i = 0;
		while (r1 < r2 && c1 < c2) {
			for (i = c1; i <= c2; i++) {
				System.out.println(a[r1][i]);
			}
			r1++;
			for (i = r1; i <= r2; i++) {
				System.out.println(a[i][c2]);
			}
			c2--;
			if (r1 <= r2) {
				for (i = c2; i >= c1; i--) {
					System.out.println(a[r2][i]);
				}
				r2--;
			}
			if (c1 <= c2) {
				for (i = r2; i >= r1; i--) {
					System.out.println(a[i][c1]);
				}
			}
			c1++;
		}

	}

}
