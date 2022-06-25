package src.main.java.tutorials.misc;

public class Test10 {

	public static int[] sort(int[] unsorted){
		int len = unsorted.length;		
		for(int i=0; i< len; i++) {
			for(int j=i; j<len; j++) {
				if(unsorted[i]>unsorted[j]) {
					int temp = unsorted[i];
					unsorted[i] = unsorted[j];
					unsorted[j] = temp;
				}
				
			}
		}
		return unsorted;
	}
	
	public int find2ndNo(int[] arr) {
		int[] sorted = sort(arr);
		return sorted[arr.length-2];
	}
	
	public static void main(String[] args) {
		int[] arr = new int[]{10,20,45,67,9,7,11};
		Test10 t= new Test10();
		System.out.println(t.find2ndNo(arr));

	}

}
