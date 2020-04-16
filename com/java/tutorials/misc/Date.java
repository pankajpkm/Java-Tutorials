package com.java.tutorials.misc;
/**
 *@author Pankaj.Kumar
 * Used Java 8 for all the Tutorials
 */
import java.time.LocalDate;

public class Date {

	/*** 
	 * @param year
	 * @param month
	 * @param dayOfMonth
	 * @return Day of the Week, Beauty of Java 8 
	 */
	public String getDay(int year, int month, int dayOfMonth){
		LocalDate date = LocalDate.of(year, month, dayOfMonth);
		return date.getDayOfWeek().name();
	}
	
	public static void main(String[] args) {
		Date d = new Date();
		String dow=d.getDay(2020, 04, 12);
		System.out.println(dow);
	}
}
