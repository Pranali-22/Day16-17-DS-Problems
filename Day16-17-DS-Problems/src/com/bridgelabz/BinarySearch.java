/**
 * 
 */
package com.bridgelabz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Dell
 *Binary Search the Word from Word List
 */
public class BinarySearch {

	/**
	 * @param args
	 */
	public void findWordUsingBinaySearch(String[] wordArray, String wordToSearch, int startPoint, int endPoint) {
		int midPoint = (startPoint+ endPoint)/2;
		
		if(wordArray[midPoint].equals(wordToSearch)) {
			System.out.println(wordToSearch+" found at index "+midPoint);
			return;
		}
		if(wordArray[midPoint].compareTo(wordToSearch) > 0){
			findWordUsingBinaySearch(wordArray, wordToSearch, startPoint, midPoint-1);
		}
		else {
			findWordUsingBinaySearch(wordArray, wordToSearch, midPoint+1, endPoint);
		}
	}
	
	public static void main(String[] args) {
		
		String fileData="Read in a list of words from File. Then prompt the user to enter a word to search the list. The program reports if the search word is found in the list.";
		String a ="bbbb nn";
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a word to search in file data");
		String wordToSearch = input.nextLine();
		
		String[] wordList = fileData.split(" ");
		Arrays.sort(wordList);
		
		for(int i=0; i<wordList.length;i++) {
			System.out.println(wordList[i]);
		}
		
		BinarySearch binarySearch = new BinarySearch();
		binarySearch.findWordUsingBinaySearch(wordList, wordToSearch, 0, wordList.length-1);
		
		
	}

}
