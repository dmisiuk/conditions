package org.minsler.day3;


import java.util.Calendar;

public class NextDate {

	public static void main(String [] args){
		
		int day = 31;
		int month = 12;
		int year = 2012;
		
		Calendar date = Calendar.getInstance();
		
		date.set(year, month, day + 1);
		
		System.out.println(day + "." + month +  "." + year);
		System.out.println(date.get(Calendar.DAY_OF_MONTH)+"."+date.get(Calendar.MONTH)+"."+date.get(Calendar.YEAR));
		
	}
}
