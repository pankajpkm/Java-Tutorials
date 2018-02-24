package com.java.tutorials.algo;

public class Sift0LeftAnd1RightArray {
	
	public int[] sift0and1(int[] arr){
		int length= arr.length-1;
		int temp;		
		for (int i=0; i<=length; i++){
			//Check if left element is 1
			if(arr[i] == 1){
				for(int j=length; j>=i; j--){
					//Check if right element is 0
					if(arr[j] == 0){
						//Swap the number
						temp = arr[j];
						arr[j]=arr[i];
						arr[i] = temp;
						break;
					}
				}
			}
		}
		return arr;
		
	}

	public static void main(String[] args) {
		
		int arr[] = new int[]{0,1,1,0,1,0,1,0,0,0,1};
		Sift0LeftAnd1RightArray a=new Sift0LeftAnd1RightArray();
		a.sift0and1(arr);
		for(int k=0; k<=arr.length-1; k++){
			System.out.println(arr[k]);
		}

	}

}
