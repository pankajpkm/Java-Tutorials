package src.main.java.tutorials.misc;

import java.util.Arrays;

public class Test1 {
	//[2,8,3,0] = o/p - 8320
	
	public String getHighestValues(int[] input) {
		int size= input.length;
		StringBuffer sb = new StringBuffer();
		if(size<0)
			return null;
		
		Arrays.sort(input);
		for(int i=size-1; i>= 0; i--) {
			sb.append(input[i]);
		}
		
		return sb.toString();
	}
	
	public static void main(String[] args) {
		int [] input = new int[] {2,8,3,0};
		
		Test1 t = new Test1();
		System.out.println(t.getHighestValues(input));

	}

}
