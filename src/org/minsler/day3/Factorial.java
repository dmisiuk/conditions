package org.minsler.day3;

public class Factorial {

	public static void main(String[] args) {

		long f = 1;
		int endNumber = 10;
		int i = 1;

		while (i <= endNumber) {
			f = f * i;
			System.out.println(i + ": " + f);
			i++;
		}

	}

}
