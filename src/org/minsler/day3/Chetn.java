package org.minsler.day3;

public class Chetn {

	public static void main(String[] args) {
		
		int a = 2779;
		String str = " четное";
		
		if (a % 2  != 0) {
			str  = " не" + str; 
		} 
		System.out.println("Число " + a + str);

	}

}
