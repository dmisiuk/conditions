package org.minsler.day3;

public class Giperbal {
	public static void main(String[] args) {

		double step = 0.25;
		double x, y;
		int time = 0;

		for (int i = 0; i < 1000; i++) {
			for (x = -2; x < 2; x += step) {
				System.out.print("1/" + x + " = ");
				if (x == 0) {
					System.out.println("error: divide by zero");
					time++;
					continue;
					//break;
				}
				y = 1 / x;

				System.out.println(y);
			}
		}
		System.out.println(time + " error(s)");
	}

}
