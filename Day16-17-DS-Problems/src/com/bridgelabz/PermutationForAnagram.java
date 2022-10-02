/**
 * 
 */
package com.bridgelabz;

import java.util.ArrayList;

/**
 * @author Dell
 *
 */
public class PermutationForAnagram {
	String word;
	
	public ArrayList<String> resultOfPermutation = new ArrayList<String>();
	
	//Parameterized constructor
	public PermutationForAnagram(String word) {
		this.word = word;
	}

	//Method to swap the characters  
    public String swapCharacters(String word, int a, int b) {  
        char[] temp =word.toCharArray();  
        char ch = temp[a];  
        temp[a] = temp[b];  
        temp[b] = ch;  
        return String.valueOf(temp);  
    }  
      
    //Method to generate permutations
    public void findPermutationOfWord(String word, int startPoint, int endPoint)  
    {           
        if (startPoint == endPoint-1) {
        	resultOfPermutation.add(word);
        }
              
        else  
        {  
            for (int i = startPoint; i < endPoint; i++)  
            {  
                word = swapCharacters(word,startPoint,i);  
                
                findPermutationOfWord(word,startPoint+1,endPoint);  
                  
            }  
        }  
    }  

}
