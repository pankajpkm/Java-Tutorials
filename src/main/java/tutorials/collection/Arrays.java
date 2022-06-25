package src.main.java.tutorials.collection;
/**
 *@author Pankaj.Kumar
 * Used Java 8 for all the Tutorials
 */
import java.util.Scanner;

public class Arrays {

	public static void main(String args[]){

	    Scanner in = new Scanner(System.in);
	    System.out.println("Enter size of the arr : ");
	    int sizeOfArr=in.nextInt();
	    int[] arr = new int[sizeOfArr];
	  
	    for(int i=0 ; i<sizeOfArr; i++){
	    	System.out.println("Please enter an int num : ");
	        arr[i] = in.nextInt();
	    }
	    for(int j=0 ; j < sizeOfArr; j++){
	        System.out.println(arr[j]);
	    }
	    in.close();
	}

}
