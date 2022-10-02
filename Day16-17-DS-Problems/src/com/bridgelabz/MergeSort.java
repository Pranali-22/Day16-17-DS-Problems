/**
 * 
 */
package com.bridgelabz;


/**
 * @author Dell
 * Merge Sort - Write a program to do Merge Sort of list of Strings.
 */
public class MergeSort {

	public int sizeOfArray;
	public String[] stringArray;
	
	//Parameterised constructor	
	public MergeSort(int sizeOfArray, String[] stringArray) {
		super();
		this.sizeOfArray = sizeOfArray;
		this.stringArray = stringArray;
	}

	//Function to sort array
	public void mergeSortOfArray(String[] stringArray2, int startPoint, int endPoint) {
		
		 if (startPoint < endPoint)   
		    {  
		        int mid = (startPoint + endPoint) / 2;  
		        mergeSortOfArray(stringArray2, startPoint, mid);  
		        mergeSortOfArray(stringArray2, mid + 1, endPoint);  
		        mergeSort(stringArray, startPoint, mid, endPoint);  
		    }  

	}
	
	public void mergeSort(String[] stringArray, int startPoint, int mid, int endPoint) {
		int i, j;  
	    int n1 = mid - startPoint + 1;    
	    int n2 = endPoint - mid;    
	      
	    //Split the input array into two halves  
	    String[] LeftArray = new String[n1];  
	    String[] RightArray = new String[n2];  
	      
	    //initialize arrays  
	    for (i = 0; i < n1; i++) {
	    	LeftArray[i] = stringArray[startPoint+i];   
	    }
	    
	    for (i = 0; i < n2; i++) {  
	    	RightArray[i] = stringArray[mid+1+i]; 
	    }
	      
	    i = 0;
	    j = 0;   
	    int k = startPoint;   
	      
	    while (i < n1 && j < n2)    
	    {    
	        if(LeftArray[i].compareTo(RightArray[j]) <= 0)    
	        {    
	        	stringArray[k] = LeftArray[i];    
	            i++;    
	        }    
	        else    
	        {    
	        	stringArray[k] = RightArray[j];    
	            j++;    
	        }    
	        k++;    
	    }    
	    while (i<n1)    
	    {    
	    	stringArray[k] = LeftArray[i];    
	        i++;    
	        k++;    
	    }    
	      
	    while (j<n2)    
	    {    
	    	stringArray[k] = RightArray[j];    
	        j++;    
	        k++;    
	    }    
		
	}
	
	//Function to print array
	public void displayArray() {
		for(int i=0; i<sizeOfArray; i++) {
			System.out.print(stringArray[i]+" ");
		}
	}

}
