package com.practice.patterns;

import java.util.Scanner;

/* 
 * nput: S = “aaaaaaaaaaa”
Output: ba  
Explanation:
First convert the given string to “a11” i.e. write, character along with its frequency.
Then, change “a11” to “ab” because 11 is b in hexadecimal.
Then, finally reverse the string i.e “ba”.
Input: S = “abc”
Output: 1c1b1a
 */
public class CountAndConversionInHexadecimal {
//5.45--6.03---6.38
	public static void main(String[] args) {

//		System.out.println("enter the String");
//		Scanner sc = new Scanner(System.in);
//		String input=sc.next();
		String input = "aaaaaaaaaaaaabbbbbbbbbbbbbbbbbbbbbbbbbbbbbbcccccccccccccccc";
		// String input = "abc";
		String alphaCount = "";
		for (int i = 0; i < input.length(); i++) {
			int count = 0;
			// System.out.println(" " + i);
			for (int j = i; j < input.length(); j++) {
				if (j == input.length() - 1 && input.charAt(i) == input.charAt(j)) {
					count++;
					alphaCount = alphaCount + input.charAt(i) + "" + count + "";
					i = j;
					break;
				} else if (input.charAt(i) == input.charAt(j)) {
					count++;
				} else {
					// System.out.println(count);
					alphaCount = alphaCount + input.charAt(i) + "" + count + "";
					i = j - 1;

					break;
				}
			}

		}
		System.out.println("alpha count : " + alphaCount);
		String result = "";
		int index = 0;
		boolean flag = false;

		for (int i = 0; i < alphaCount.length(); i++) {
			String num = "";
			if (alphaCount.charAt(i) >= '0' && alphaCount.charAt(i) <= '9') {
				for (int j = i; j < alphaCount.length(); j++) {
					if (j == alphaCount.length() - 1 && alphaCount.charAt(j) >= '0' && alphaCount.charAt(j) <= '9') {
						num = num + alphaCount.charAt(j);
						flag = true;
						break;
					} else if (alphaCount.charAt(j) >= '0' && alphaCount.charAt(j) <= '9') {
						num = num + alphaCount.charAt(j);

					} else {
						index = j;
						// i=j;

						break;
					}
				}
				// System.out.println("num " + num);
				result = result + changeTohexadecimal(alphaCount.charAt(i - 1) + "", num);

				if (!flag)
					i = index;
				else {
					break;
				}

//				
			}

		}
		// System.out.println(" hexa value conversion :"+result);
		reverseTheResult(result);

	}

	private static void reverseTheResult(String result) {
		String finalresult = "";
		int index = 0;
		for (int i = result.length() - 1; i >= 0; i--) {
			finalresult = finalresult + result.charAt(i);
			// System.out.println(finalresult);
			if (result.charAt(i) >= '0' && result.charAt(i) <= 9) {
				String num = "";
				for (int j = i; j > 0; j--) {
					if (result.charAt(j) >= '0' && result.charAt(j) <= '9') {
						index = j;
					}
				}
				for (int p = index; p <= i; p++) {
					num = num + result.charAt(index);
				}
				finalresult = finalresult + num;

				i = index - 1;
			}
		}
		System.out.println("final :  " + finalresult);
	}

	private static String changeTohexadecimal(String character, String Stringnum) {

		String result = "";

		char Hexachars[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };
		int num = Integer.parseInt(Stringnum);
		String hexavalue = "";
		while (num > 0) {
			int rem = num % 16;
			hexavalue = hexavalue + Hexachars[rem];
			num = num / 16;

		}
		// System.out.println(character + hexavalue + " hecxa");
		return character + hexavalue;
	}

}
