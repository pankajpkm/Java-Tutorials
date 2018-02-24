package com.java.tutorials;

public class GenericMethod {

	public static void main(String[] args) {
		
		printMe(1,3);
		printMe("as","sss");
		printMe("a",89);
	}

	private static <T> void printMe(T x, T y){		
		System.out.printf("%s %s\n", x, y);
	}
	private static void printMe(String a, int b){
		System.out.printf("Printing non generic method : %s %s\n", a, b);
	}
}
