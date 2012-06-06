package org.minsler.day3;
/**
 * 
 * @author minsler
 * 
 */

public class NumberCounter {
	
	private long number;
	private int maxNumber = 0;
	private int maxCount = 1;
	
	public long getNumber() {
		return number;
	}

	public int getMaxNumber() {
		return maxNumber;
	}

	public int getMaxCount() {
		return maxCount;
	}

	public NumberCounter(long number){
		this.number = number;
		findMostFrequentellyNumber();
	}
	
	private void findMostFrequentellyNumber(){
		long b;
		long mod;
		int currentCount;
		
		for (int i = 0; i < 10; i++) {
			currentCount = 0;
			b = number;
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
	
	}
		
}
