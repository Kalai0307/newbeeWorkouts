package com.practice.patterns;

import java.util.Arrays;

//3.05--3.27
public class ArrangeElementsByRange {

	public static void main(String[] args) {

		int a[] = { 2, 5, 2, 8, 5, 6, 8, 8,9999999,-1 };
		boolean visited[] = new boolean[a.length];
		int freqCount[] = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			if (visited[i] == false) {
				int count = 0;
				for (int j = i; j < a.length; j++) {
					if (a[i] == a[j]) {
						count++;
						visited[j] = true;
					}
				}
				freqCount[i] = count;

			}

		}
		arrangeElementsAccordingToFreqUsingQuickSort(a, freqCount, 0, a.length - 1);
	}

	private static void arrangeElementsAccordingToFreqUsingQuickSort(int[] a, int[] freqCount, int low, int high) {
		if (low > high) {
			return;
		}
		int start = low;
		int end = high;
		int mid = (start + end) / 2;
		int pivot = freqCount[mid];
		while (start <= end) {
			while (freqCount[start] > pivot) {
				start++;
			}
			while (freqCount[end] < pivot) {
				end--;
			}
			if (start <= end) {
				int temp = freqCount[start];
				freqCount[start] = freqCount[end];
				freqCount[end] = temp;
				int temp1 = a[start];
				a[start] = a[end];
				a[end] = temp1;
				start++;
				end--;
			}
		}
		arrangeElementsAccordingToFreqUsingQuickSort(a, freqCount, low, end);
		arrangeElementsAccordingToFreqUsingQuickSort(a, freqCount, start, high);
		int resultArray[] = new int[a.length];
		resultArray=	ArrangeElemts(a, freqCount,resultArray);
		System.out.println(Arrays.toString(resultArray));

	}

	private static int[] ArrangeElemts(int[] a, int[] freqCount, int[] resultArray) {

		
		int index = 0;
		int i = 0;
		while (freqCount[i] != 0) {
			int count = freqCount[i];
			while (count > 0) {
				resultArray[index] = a[i];
				index++;
				count--;
			}
			i++;
		}
		return resultArray;
	}

}
