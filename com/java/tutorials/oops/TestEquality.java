package com.java.tutorials.oops;

public class TestEquality {
	
	int x;
	int y;
	
	public boolean testEquality(){
	
		return (x==y);
	}
	
	public static void main(String[] args) {
		TestEquality t = new TestEquality();
		t.x=5;
		t.y=5;
		System.out.println(t.testEquality());		
	}

}
