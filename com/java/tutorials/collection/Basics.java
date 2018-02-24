package com.java.tutorials.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class A1{
	String s;
	A1(String str){
		this.s=str;
	}
	String print(String str){
		System.out.println(str);
		return str;
	}
}
public class Basics {

	public static void main(String ... args){
		Set<Object> set1= new HashSet<>();
		Set<Object> set2= new HashSet<>();
		set1.add(new A1("abc"));
		set1.add(new A1("abc")); //add as a new object
		set2.add("abc");
		set2.add("abc");  // duplicate
		System.out.println("Set sizes:\n"+set1.size() +" "+set2.size());
		
		List<Object> list1= new ArrayList<>();
		List<Object> list2= new ArrayList<>();
		list1.add(new A1("abc"));
		list1.add(new A1("abc")); //add as a new object
		list2.add("abc");
		list2.add("abc");  // duplicates are allowed
		System.out.println("List sizes:\n"+list1.size() +" "+list2.size());
	}
}

/*
 * Output 
    Set sizes:
	2 1
	List sizes:
	2 2
 */
