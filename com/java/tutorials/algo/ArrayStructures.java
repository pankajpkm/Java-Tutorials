package com.java.tutorials.algo;

public class ArrayStructures {
	private int[] myArray = new int[50];
	private int arraySize=10;

	public ArrayStructures(){
		genrateRandomArray();
	}
	
	public void genrateRandomArray(){
		for(int i=0; i< arraySize; i++){
			myArray[i] = (int) (Math.random()*10)+10; //Generating Random as (0-1) +10 
		}
	}
	public void printArray(){
		System.out.println("----------");
		for(int i=0; i< arraySize; i++){
			System.out.print("| "+i);
			System.out.println(" | "+myArray[i]+" |");
			System.out.println("----------");
		}
	}
	public void deleteAtIndex(int index){
		if(index<arraySize){
			//Start swapping the value till end
			for(int i=index; i<(arraySize-1); i++){
				myArray[i]=myArray[i+1];
			}			
			arraySize--;
		}		
	}
	public void insertValueAtEnd(int value){
		//Keep adding till max array index
		if(arraySize<50){
			myArray[arraySize]=value;
			arraySize++;
		}		
	}
	
	public String leanerSerch(int searchPram){
		boolean found=false;
		String valueWithIndex = ""; 
		System.out.print("The Value was Found in the Following Indexes: ");
		for(int i=0; i< arraySize; i++){
			if(myArray[i]==searchPram){
				found=true;
				valueWithIndex+=i+" ";
			}
		}
		if(!found){
			valueWithIndex="None";
		}
		return valueWithIndex;
	}
	
	public static void main(String[] args) {
		ArrayStructures newArraySt= new ArrayStructures();
		newArraySt.printArray();
		newArraySt.deleteAtIndex(2);
		newArraySt.insertValueAtEnd(12);
		newArraySt.printArray();
		System.out.println(newArraySt.leanerSerch(12));
	}

}
