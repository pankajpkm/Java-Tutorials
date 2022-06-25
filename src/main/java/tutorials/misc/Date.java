package src.main.java.tutorials.misc;
/**
 *@author Pankaj.Kumar
 * Used Java 8 for all the Tutorials
 */
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

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
	
	/*** 
	 * @param format
	 * @return currentDate
	 */
	public static String getCurrentDate(String format) {
		DateTimeFormatter dtf= DateTimeFormatter.ofPattern(format);
		LocalDateTime date = LocalDateTime.now();
		return dtf.format(date);
	}
	
	public static void main(String[] args) {
		Date d = new Date();
		String dow=d.getDay(2020, 04, 12);
		System.out.println(dow);
		System.out.println(getCurrentDate("dd-MMM-yyyy"));
	}
}
