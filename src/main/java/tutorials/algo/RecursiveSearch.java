package src.main.java.tutorials.algo;
/*
 * Author : Pankaj Kumar
 * 
 */
public class RecursiveSearch {
	static int unsortedList[] = {2,5,9,3,6,3,4,10,39,20};
	
	public static int recSearch(int arr[], int index, int arrLenth , int elementToFind){
		if(arrLenth<index)
			return -1;
		if(arr[index]==elementToFind)
			return index;
		return recSearch(arr,index+1,arrLenth,elementToFind);
	}

	public static void main(String[] args) {
		int elementToFind=3;
		int index = recSearch(unsortedList, 0, unsortedList.length-1, elementToFind);
		
		 if (index != -1)
	           System.out.println("Element " + elementToFind + " is present at index " + 
	                                                    index);
	        else
	            System.out.println("Element " + elementToFind + " is not present");
		
	}
}
