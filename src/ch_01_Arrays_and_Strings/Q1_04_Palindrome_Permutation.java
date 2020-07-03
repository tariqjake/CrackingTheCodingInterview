package ch_01_Arrays_and_Strings;

import java.util.Scanner;

/**
 * <p>
 * Given a string, write a function to check if it is a permutation of a
 * palindrome. A palindrome is a word or phrase that is the same forwards and
 * backwards. A permutation is a rearrangement of letters. The palindrome does
 * not need to be limited to just dictionary words.
 */
public class Q1_04_Palindrome_Permutation {

	// main method is being used for testing purposes
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your text to check if it is a Palindrome:");
		String word = scan.nextLine();
		System.out.println("Has the " + " word palindrome function ? " + isPalindrome(word) );
	}

	/**
	 * This method checks if the given {@code String word} is palindrome or not.
	 * Assumption : ASCII - UTF-8 is being used.
	 * 1- Remove the whitespace
	 * 2- Get all the chars to lower case
	 * 3- Count the chars individually
	 * 4- If the word length is even after the whitespace removed, all the chars counts should be even,
	 * if the length is odd, one char's count must be odd.
	 * 
	 * @param word
	 * @return true if {@code String word} is palindrome, false o/w
	 */
	public static boolean isPalindrome(String word) {
		String arg = word.replaceAll("\\s","").toLowerCase();
		boolean isOdd = arg.length() % 2 == 1;
		int[] letters = new int[128];
		
		for (int i = 0; i < arg.length(); i++) {
			char c = arg.charAt(i);
			letters[c]++;
		}

		for (int i = 0; i < letters.length; i++) {
			if(letters[i] != 0 && letters[i] % 2 == 0) {
				if(isOdd){
					isOdd = false;
				}else{
					return false;
				}
			}
		}
		return true;
	}

}
