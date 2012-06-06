package org.minsler.day3;
/**
 * 
 * @author minsler
 * 
 */

public class NumberCount {
	
	/**
	 * 
	 * @param args array of String passed to the Java program upon invocation
	 */
	
	public static void main(String[] args) {
		
		long a = 11000;
		
		int maxCount = 1;
		int maxNumber = 0;
		int currentCount = 0;
		long b;
		long mod;
		
		for (int i = 0; i < 10; i++) {
			currentCount = 0;
			b = a;
			while(b  > 0){
				mod = b % 10;
				b = (b - mod) / 10;
				if (mod == i){
					currentCount++;
				}
			}
			if (currentCount >  maxCount) {
				maxCount = currentCount;
				maxNumber = i;
			}
		}

		
		System.out.println(a + "\nNumber " + maxNumber + ": " + maxCount + " time(s)");
	}

}
