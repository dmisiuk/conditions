package org.minsler.day3;

public class NextDateManual {

	public static void main(String[] args) {

		int[] days = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		int[] daysLeap = days.clone();
		int[] daysCurrent = days;

		daysLeap[1] = 29;

		int day = 28;
		int month = 2;
		int year = 2012;

		System.out.println(day + "." + month + "." + year);

		if (isHighly(year)) {
			daysCurrent = daysLeap;
		}

		if ((day + 1) <= daysCurrent[month - 1]) {
			day = day + 1;
		} else if (month != 12) {
			day = 1;
			month = month + 1;
		} else {
			day = 1;
			month = 1;
			year = year + 1;
		}

		System.out.println(day + "." + month + "." + year);

	}

	public static boolean isHighly(int year) {
		if (year % 4 == 0 && year % 100 != 0) {
			return true;
		}

		if (year % 400 == 0) {
			return true;
		}

		return false;
	}
}
