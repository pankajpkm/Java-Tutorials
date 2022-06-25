package src.main.java.tutorials.collection;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class BinaryTree {
	
	public void sortedTree(){
		Integer [] numbers= {10,9,8,12,5,3,4,12,6};
		List<Integer> list=Arrays.asList(numbers);
		Set<Integer> set=new TreeSet<Integer>(list);
		System.out.println(set);
		
		//Iterate each elements
		for(Integer n : set){
			System.out.println(n);
		}
	}

	public static void main(String[] args) {
		BinaryTree tree=new BinaryTree();
		tree.sortedTree();
	}
}
