package com.java.tutorials;

interface A{
		int i = 20;
		void print();
		void m1();
	}
interface B{
		String s="Hello";
		void m1();
	}
public class InterfaceImp implements A,B{
	 
	String s1="Hello";
	String s2=new String("Hello");
	
	public void print(){
			System.out.println(A.i); //i from A
		}
	public void desp(){
		
		if(s1!=s2)
		System.out.println("S1 and S2 are not equals");
		
		s1 += " World";
		System.out.println(s1);
		
		if(s==s1)
		System.out.println("s and s1 are equals");
	}
	public void m1(){
		System.out.println(i+s);
	}
	public static void main(String[] args) {
			
		InterfaceImp c= new InterfaceImp();
			c.print();
			c.desp();
			A a= new InterfaceImp();
			a.m1();
			B b = new InterfaceImp();
			b.m1();
	
	}
}
