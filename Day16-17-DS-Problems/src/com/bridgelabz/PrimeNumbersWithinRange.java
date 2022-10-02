/**
 * 
 */
package com.bridgelabz;
import java.util.ArrayList;
/**
 * @author Dell
 *
 */
public class PrimeNumbersWithinRange {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int startNumber = 0;
		int endNumber = 1000;
		
		ArrayList<Integer> primeNumber = new ArrayList<>();
		
		for(int num =startNumber; num<=endNumber; num++) {
			int isPrime=0;
			if(num>1) {
				for(int i=2; i<=num/2; i++) {
					if(num%i == 0) {
						isPrime=1;
						break;
					}
				}
				
				if(isPrime == 0) {
					primeNumber.add(num);
				}
			}
			
		}
		
		for(int a : primeNumber)
			System.out.print(a+" ");

	}

}
