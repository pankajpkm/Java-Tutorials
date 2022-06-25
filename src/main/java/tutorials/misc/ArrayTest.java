package src.main.java.tutorials.misc;

import java.util.Arrays;

public class ArrayTest {

	public static String highAndLow(String numbers) {
        String[] arr= numbers.split(" ");
        Arrays.sort(arr);
        return arr[0]+" "+arr[arr.length-1];
    }
	
	public static void main(String[] args) {
		System.out.println(highAndLow("3 1 5 8"));
	}
}
