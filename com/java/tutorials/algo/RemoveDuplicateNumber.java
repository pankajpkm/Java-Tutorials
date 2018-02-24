package com.java.tutorials.algo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

class RemoveDuplicateNumber {
	List<Integer> distNumber = new ArrayList<Integer>();
    public List<Integer> removeDuplicateElements(Integer[] arr){    	
    	List<Integer> lst= new ArrayList<Integer>(
				Arrays.asList(arr));
    	
		ListIterator<Integer> lstItr= lst.listIterator();
		while(lstItr.hasNext()){
			Integer s = (Integer)lstItr.next();				
			if(!distNumber.contains(s)){
				distNumber.add(s);
			}
			
		}
		// Sorting new List in Descending order
		Collections.sort(distNumber, new myCompartor());
		return distNumber;
    }
    public static void main(String[] args){
    	Integer[] arr={9,1,2,11,2,1,5,5,4,5,4};
    	RemoveDuplicateNumber r = new RemoveDuplicateNumber();
    	r.removeDuplicateElements(arr);

		System.out.println(r.distNumber);
    }
}
class myCompartor implements Comparator {
	public int compare(Object arg0, Object arg1) {
		Integer a =(Integer)arg0;
		Integer b =(Integer)arg1;
		return -a.compareTo(b);
	}
	
}
