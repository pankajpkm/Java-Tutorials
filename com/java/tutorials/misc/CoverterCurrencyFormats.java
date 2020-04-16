package com.java.tutorials.misc;
/**
 *@author Pankaj.Kumar
 * Used Java 8 for all the Tutorials
 */
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class CoverterCurrencyFormats {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter payment amount : ");
        double payment = scanner.nextDouble();
        scanner.close();
        // Instantiating Locale for India, as it is not available by default.
        Locale INDIA= new Locale("en", "IN");

        NumberFormat us = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat india = NumberFormat.getCurrencyInstance(INDIA);
        NumberFormat china = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat france = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        
        System.out.println("US: " + us.format(payment));
        System.out.println("India: " + india.format(payment));
        System.out.println("China: " + china.format(payment));
        System.out.println("France: " + france.format(payment));
    }
}
