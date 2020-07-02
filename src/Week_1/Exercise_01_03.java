package Week_1;

import java.util.Scanner;

import utils.QuestionSetup;

/**
 * URLify: Write a method to replace all spaces in a string with '%20'. You may
 * assume that the string has sufficient space at the end to hold the additional
 * characters, and that you are given the "true" length of the string. (Note:
 * use a character array so that you can perform this operation in place.)
 */
public class Exercise_01_03 {

	public static void main(String[] args) {
		String s = "de n e m    ec              ";
		System.out.println("Converting " + s);
		
		System.out.println("New Format :" + replaceSpaces(s).toString());
		
	}

	/*
	 * The first thing that comes to my mind would be using replaceAll method
	 * with O(n) since replaceAll works with StringBuffer However in the
	 * interviews, preset methods are not allowed and since the question
	 * suggests the char[], resizable dynamic approach seems fair.
	 */

	public static String replaceSpaces(String word) {
		char[] arr = new char[word.length()];
		for (int i = 0,j = 0; j < word.length(); i++,j++) {
			if (word.charAt(i) == ' ') {
				arr[j++] = '%';
				arr[j++] = '2';
				arr[j] = '0';
			} else {
				arr[j] = word.charAt(i);
			}
		}
		return new String(arr);
	}
}
