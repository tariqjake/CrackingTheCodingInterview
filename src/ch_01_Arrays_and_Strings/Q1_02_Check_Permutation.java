package ch_01_Arrays_and_Strings;

import java.util.Arrays;
import java.util.Scanner;

/**
 * <p>Check Permutation: Given two strings, write a method to decide if one is a permutation of the other.
 */
public class Q1_02_Check_Permutation {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first String:");
		String word1 = scan.nextLine();
		System.out.println("Enter the second String:");
		String word2 = scan.nextLine();
		System.out.println("Is there are a permutation between two strings (Sorting Approach):" + isPermut(word1, word2));
		System.out.println("Is there are a permutation between two strings (Array Approach):" + isPermut(word1, word2));
	}

	/**
	 * SORTING
	 * 
	 * @param word1
	 * @param word2
	 * @return true if the arguments are permutation to one another
	 */
	public static boolean isPermutation(String word1, String word2) {
		if (word1 == null || word2 == null || word1.length() != word2.length()) {
			return false;
		}
		char[] charArr1 = word1.toCharArray();
		char[] charArr2 = word2.toCharArray();
		Arrays.sort(charArr1);
		Arrays.sort(charArr2);

		return charArr1.toString().equals(charArr2.toString());
	}

	/**
	 * Arrays
	 * Assumptions : ASCII UTF-8 is being used
	 * @param word1
	 * @param word2
	 * @return true if the arguments are permutation to one another
	 */
	public static boolean isPermut(String word1, String word2) {
		if (word1 == null || word2 == null || word1.length() != word2.length()) {
			return false;
		}
		int[] arr = new int[128];

		for (int i = 0; i < word1.length(); i++) {
			arr[word1.charAt(i)]++;
			arr[word2.charAt(i)]--;
		}

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				return false;
			}
		}
		return true;
	}
}
