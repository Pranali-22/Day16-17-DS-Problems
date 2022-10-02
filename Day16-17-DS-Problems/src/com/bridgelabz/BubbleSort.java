/**
 * 
 */
package com.bridgelabz;

import java.util.Scanner;

/**
 * @author Dell
 * Program on Bubble sort
 */
public class BubbleSort {

	/**
	 * @param args
	 */
	public void bubbleSortOfArray(int[] numArray) {
	
		int n = numArray.length;  
        int temp;
        
        for(int i=0; i < n; i++){  
        	for(int j=1; j < (n-i); j++){  
        		if(numArray[j-1] > numArray[j]){  
        			temp = numArray[j-1];  
                    numArray[j-1] = numArray[j];  
                    numArray[j] = temp;  
                }  
                          
            }  
         }
	}
	
	public static void main(String[] args) {
		
		BubbleSort bubbleSort = new BubbleSort();
		Scanner input = new Scanner(System.in);
		System.out.println("Enter size of array");
		int n = input.nextInt();
		int[] numArray = new int[n];
		
		System.out.println("Enter numbers for sort");
		for(int i=0; i<n; i++) {
			numArray[i] = input.nextInt();
		}
		
		System.out.println("Array before bubble sort");
		for(int i=0; i<n; i++) {
			System.out.print(numArray[i]+" ");
		}
		
		bubbleSort.bubbleSortOfArray(numArray);
		
		System.out.println("Array after bubble sort");
		for(int i=0; i<n; i++) {
			System.out.print(numArray[i]+" ");
		}
		
		input.close();
		
	}

}
