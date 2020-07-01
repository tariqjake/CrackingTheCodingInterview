package Week_1;

import java.util.Hashtable;
import java.util.Scanner;

/*
 * 1.1 Is Unique: Implement an algorithm to determine if a string has all unique characters. 
 * What if you cannot use additional data structures?
 */
public class Exercise_01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a value to check if it has all the chars unique:");
		String word=scan.nextLine();
		
		System.out.println("Hashtable solution : " + hasAllUniqueCharacters(word));
		System.out.println("Array solution 	   : " + hasAllUniqueChars(word));
		
	}

	/**
	 * HashTable
	 * 
	 * @param word
	 * @return true if the String has all unique characters,false o/w.
	 */
	private static boolean hasAllUniqueCharacters(String word) {
		if (word == null || word.length() <= 1) {
			return true;
		}

		Hashtable table = new Hashtable();
		for (int i = 0; i < word.length(); i++) {
			String key = String.valueOf(word.charAt(i));
			if (table.containsKey(key)) {
				return false;
			} else {
				table.put(key, Integer.valueOf(1));
			}
		}
		return true;
	}
	
	/**
	 * HashTable
	 * 
	 * Assumptions : UTF-8 ASCII table is being used
	 * 
	 * @param word
	 * @return true if the String has all unique characters,false o/w.
	 */

	public static boolean hasAllUniqueChars(String word) {
		int[] asciiChars = new int[128];
		
		if (word == null || word.length() <= 1) {
			return true;
		}
		
		if(word.length() >128){
			return false;
		}
		
		for (int i = 0; i < word.length(); i++) {
			int index = word.charAt(i);
			if(asciiChars[index]>0){
				return false;
			}else{
				asciiChars[index]++;
			}
		}
		return true;
	}
	
	
	
	/*
	 * AKLIMA TAKILAN SORULAR
	 * 1 - Hashtable ile HashMap arasinda synchronized olmasi disinda ne fark var, neden "hint" hashtable dedi.
	 * 2 - Hint te bit vektor dedi, hic kullanmadim. Kullanim alani nedir?
	 */

}
