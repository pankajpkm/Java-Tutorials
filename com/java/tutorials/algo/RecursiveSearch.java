package com.java.tutorials.algo;
/*
 * Author : Pankaj Kumar
 * 
 */
public class RecursiveSearch {
	static int unsortedList[] = {2,5,9,3,6,3,4,10,39,20};
	
	public static int recSearch(int arr[], int i, int l , int x){
		if(l<i)
			return -1;
		if(arr[i]==x)
			return i;
		return recSearch(arr,i+1,l,x);
	}

	public static void main(String[] args) {
		int x=20;
		int index = recSearch(unsortedList, 0, unsortedList.length-1, x);
		
		 if (index != -1)
	           System.out.println("Element " + x + " is present at index " + 
	                                                    index);
	        else
	            System.out.println("Element " + x + " is not present");
		
	}
}
