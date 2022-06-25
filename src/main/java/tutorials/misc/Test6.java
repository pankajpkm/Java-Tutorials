package src.main.java.tutorials.misc;

public class Test6 {

	public static void main(String[] args) {
		//ignore 4,6,9
		
		int[] arr =new int[] {1,2,9,4,5,9,7,8,9,10};
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]!=9)
				System.out.println(arr[i]);
		}
	}

}
//NoSuchElement -  
//StaleElement - Element - <>
//ElementNotEnabe
//NotVisible

