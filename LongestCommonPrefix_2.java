package com.practice.patterns;

/*1.Given a set of strings, find the longest common prefix.
Examples: 
 
Input: {"geeksforgeeks", "geeks", "geek", "geezer"}
Output: "gee"

Input: {"apple", "ape", "april"}
Output: "ap"
* 11.13
 */
public class LongestCommonPrefix_2 {

	public static void main(String[] args) {

		//String words[] = { "geeksforgeeks", "geeks", "geek", "geezer" };
		String words[] =		{"apple", "ape", "april"};
		String SmallestLengthWord = "";
		int index = 0;
		int length = words[0].length();
		for (int i = 0; i < words.length; i++) {
			if (words[i].length() < length) {
				index = i;
				length = words[i].length();
			}

		}
		SmallestLengthWord = words[index];
		System.out.println(" smallest word : " + SmallestLengthWord);
		String result = "";
		for (int i = 0; i < SmallestLengthWord.length(); i++) {
			boolean flag = false;
			for (int j = 0; j < words.length; j++) {
				if (SmallestLengthWord.charAt(i) == words[j].charAt(i)) {
					flag = true;
				} else {
					flag = false;
					break;
				}

			}
			if(flag)
			{
				result=result+SmallestLengthWord.charAt(i);
			}
			else
			{
				break;
			}
		}
		System.out.println(" result :   "+ result );

	}

}
