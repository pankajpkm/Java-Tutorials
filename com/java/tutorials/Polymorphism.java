package com.java.tutorials;

class A2{
	//Overloading
	public String getDescription(Object obj){
		return obj.toString()+" from object"; 
		}
	public String getDescription(String obj){
		return obj+" from string"; 
		}
	public static String getStaticDescription(String obj){
		return obj+" from static string of A2"; 
		}
}
class B2 extends A2{
	//Overriding
	public String getDescription(String obj){
		return obj+" from string"; 
		}
	//Method hiding
	public static String getStaticDescription(String obj){
		return obj+" from static string of B2"; 
		}
}
public class Polymorphism extends B2{

	public static void main(String[] args) {
		Polymorphism p = new Polymorphism();
		System.out.println(p.getDescription("Hello"));
		System.out.println(p.getDescription(true));
		System.out.println(Polymorphism.getStaticDescription("Hi"));

	}

}
/*
 * Outputs
	Hello from string
	true from object
	Hi from static string of B2
*/