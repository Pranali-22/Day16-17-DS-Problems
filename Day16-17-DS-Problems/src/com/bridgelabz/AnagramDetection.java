/**
 * 
 */
package com.bridgelabz;
import java.util.Scanner;
/**
 * @author Dell
 * An Anagram Detection Example
 */
public class AnagramDetection {

	/**
	 * @param args
	 */
	//Function to check for the anagram
	private void checkAnagram(String str1, String str2) {
		PermutationForAnagram permutationForAnagram = new PermutationForAnagram(str1);
		
		permutationForAnagram.findPermutationOfWord(str1, 0, str1.length());
		
		if(permutationForAnagram.resultOfPermutation.contains(str2)) {
			System.out.println(str1+ " and "+str2+" are anagrams.");
		}
		else {
			System.out.println(str1+ " and "+str2+" are not anagrams.");
		}
		
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter two strings to check anagram");
		String str1 = input.nextLine();
		String str2 = input.nextLine();
		
		AnagramDetection anagramDetection = new AnagramDetection();
		
		anagramDetection.checkAnagram(str1, str2);
		
		input.close();

	}

	
}
