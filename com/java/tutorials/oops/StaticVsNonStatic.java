package com.java.tutorials.oops;
/*
* Author Pankaj Kumar (pankajpkm)
*/
public class StaticVsNonStatic {

	private static String x= "Static instance Variable";
	private String y= "Non Static instance Variable";
	
	private void instanceMethod(){
		System.out.println("Inside Instance method in Same Class");
	}
	private static void staticMethod(){
		System.out.println("Inside Static method in Same Class");
	}

	private static class NestedClass{
		NestedClass(){
			System.out.println("Inside NestedClass constructor");
		}
		private void show(){
			System.out.println(x);
		}
	}
	private class InnerClass{
		InnerClass(){
			System.out.println("Inside innerClass constructor");
		}
		private void show(){
			System.out.println(x +" "+y);
		}
	}

	public static void main(String[] args) {
		StaticVsNonStatic s=new StaticVsNonStatic();
		s.instanceMethod();
		staticMethod();
		NestedClass nc = new NestedClass();
		nc.show();
		StaticVsNonStatic.InnerClass ic = s.new InnerClass();
		ic.show();
		
	}

}
