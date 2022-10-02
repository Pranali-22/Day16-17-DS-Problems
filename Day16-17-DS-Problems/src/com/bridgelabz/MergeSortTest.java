/**
 * 
 */
package com.bridgelabz;

import java.util.Scanner;

/**
 * @author Dell
 * Merge Sort - Write a program to do Merge Sort of list of Strings.
 */
public class MergeSortTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter size of array");
		int n = input.nextInt();
		String[] stringArray = new String[n];
		
		System.out.println("Enter string for sort");
		for(int i=0; i<n; i++) {
			stringArray[i] = input.next();
		}
		
		MergeSort mergeSort = new MergeSort(n, stringArray);
		
		System.out.println("\nArray before merge sort");
		mergeSort.displayArray();
		
		mergeSort.mergeSortOfArray(stringArray, 0, n-1);
		
		System.out.println("\n\nArray after merge sort");
		mergeSort.displayArray();
		
		input.close();
	}
}
