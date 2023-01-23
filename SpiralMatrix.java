package com.practice.patterns;

public class SpiralMatrix {

	public static void main(String[] args) {
		// int a[][] = { { 1, 2, 3,10,100 }, { 4, 5, 6,20,200}, { 7, 8,
		// 9,30,300},{10,11,12,40,400} };
		int a[][] = { { 1, 2 }, { 3, 4 }, { 5, 6 }, { 7, 8 } };
		int l = 0, k = 0;
		int row = a.length, col = a[0].length;
		while (l < row && k < col) {
			for (int i = k; i < col; i++) {
				System.out.println(a[l][i]);
			}
			l++;// 1
			for (int j = l; j < row; j++) {
				System.out.println(a[j][col - 1]);
			}
			col--;// 3
			if (l < row)//
			{
				for (int p = col - 1; p >= k; p--) {
					System.out.println(a[row - 1][p]);
				}
				row--;
			}
			if (k < col) {
				for (int q = row - 1; q >= l; q--) {
					System.out.println(a[q][k]);
				}
				k++;
			}
		}

	}

}
