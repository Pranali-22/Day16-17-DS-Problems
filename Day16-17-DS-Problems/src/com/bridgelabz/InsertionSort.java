/**
 * 
 */
package com.bridgelabz;

import java.util.Scanner;

/**
 * @author Dell
 * Program on Insertion sort
 */
public class InsertionSort {

	/**
	 * @param args
	 */
	public void insertionSortOfArray(int[] numArray) {
		System.out.println("............");
		int n = numArray.length;
        for (int i = 1; i < n; i++) {
            int value = numArray[i];
            int j = i - 1;
  
            while (j >= 0 && numArray[j] > value) {
            	numArray[j+1] = numArray[j];
                j--;
            }
            numArray[j+1] = value;
        }
        
	}
	
	public static void main(String[] args) {
		
		InsertionSort insertionSort = new InsertionSort();
		Scanner input = new Scanner(System.in);
		System.out.println("Enter size of array");
		int size = input.nextInt();
		int[] numArray = new int[size];
		
		System.out.println("Enter numbers for sort");
		for(int i=0; i<size; i++) {
			numArray[i] = input.nextInt();
		}
		
		System.out.println("Array before insertion sort");
		for(int i=0; i<size; i++) {
			System.out.println(numArray[i]);
		}
		
		insertionSort.insertionSortOfArray(numArray);
		
		System.out.println("Array after insertion sort");
		for(int i=0; i<size; i++) {
			System.out.println(numArray[i]);
		}
		
	}

}
