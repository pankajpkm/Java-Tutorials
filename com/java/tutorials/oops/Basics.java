package com.java.tutorials.oops;

class A1{
	
	int x= 10;
	void m1(){
		System.out.println("m1 from A1");
	}
	static void m2(){
		System.out.println("m2 from A1");
	}
}
class B1 extends A1{
	int x=20;
	//Method Overriding
	void m1(){
		System.out.println("m1 from B1");
	}
	// Method hiding
	static void m2(){
		System.out.println("m2 from B1");
	}
}
public class Basics {	

	public static void main(String[] args) {
		//Create objects
		A1 a= new A1();
		System.out.println(a.x); //Variable always depends on Reference type
		a.m1();
		a.m2(); // with warning as static we can call direct, but will execute without any error
		A1.m2();
		
		A1 b = new B1();
		System.out.println(b.x); //Variable always depends on Reference type
		b.m1(); //Methods overriding resolution depends on runtime objects
		b.m2(); //Methods hiding depends on reference type
		
		B1 b1 = new B1();
		System.out.println(b1.x); //Variable always depends on Reference type
		b1.m1();
		b1.m2();
		B1.m2();
		
		//Type Casting
		
		Object obj = new B1(); //there is no problem in this line
		((A1) obj).m1(); //1 way to get this, by type casting we can change the reference
		
		((A1)b).m1();
		((B1)b).m1();
		((A1)a).m1();
		//((B1)a).m1();  ClassCastException A1 cannot be cast to B1 // At run time
				
	}

}

//out puts from above
/*
10
m1 from A1
m2 from A1
m2 from A1
10
m1 from B1
m2 from A1
20
m1 from B1
m2 from B1
m2 from B1
m1 from B1
m1 from B1
m1 from B1
m1 from A1
*/
