package com.java.tutorials.algo;
/*
 * Author : Pankaj Kumar
 * 
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class RemoveDuplicatesFromList {

	public static void main(String[] args) {
		
		List<String> lst= new ArrayList<String>(
				Arrays.asList("A","A","B","B","C","C"));
		ListIterator<String> lstItr= lst.listIterator();
		while(lstItr.hasNext()){
			String s = lstItr.next();		
			if(s.equals(lstItr.next())){
				lstItr.remove();
			}			
		}
		System.out.println(lst);
	}

}
