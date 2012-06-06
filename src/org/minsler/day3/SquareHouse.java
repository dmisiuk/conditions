package org.minsler.day3;

public class SquareHouse {

	public static void main(String[] args) {

		int x = 100;
		int y = 100;
		int a = 60;
		int b = 60;
		int c = 50;
		int d = 80;
		boolean entery = false;

		if (y >= a + c && x >= b && x >= d) {
			entery = true;
		} else if (y >= a + d && x >= b && x >= c) {
			entery = true;
		} else if (y >= b + c && x >= a && x >= d) {
			entery = true;
		} else if (y >= b + d && x >= a && x >= c) {
			entery = true;
		} else if (x >= a + c && y >= b && y >= d) {
			entery = true;
		} else if (x >= a + d && y >= b && y >= c) {
			entery = true;
		} else if (x >= b + c && y >= a && y >= d) {
			entery = true;
		} else if (x >= b + d && y >= a && y >= c) {
			entery = true;
		}

		if (entery) {
			System.out.println("Поместятся");
		} else {
			System.out.println("Не поместятся");
		}
	}

}
