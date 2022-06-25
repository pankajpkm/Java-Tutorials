package src.main.java.tutorials.misc;

public class Test14 {

	
	public int[][] suffelArray(int[] arr){
		int len = arr.length;
		int[][] res = new int[100][len];
		int index=0;
		for(int i=0; i<len; i++) {			
			for(int j=1; j<len; j++) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				res[index] =  arr;
				index++;
			}			
		}
		return res;
		
	}
	
	
	public static void main(String[] args) {
		/*[1,2,3]
		Op =
		[[1,2,3], [1,3,2], [2,3,1], [2,1,3], [3,1,2], [3,2,1]]*/
		
		Test14 t= new Test14();
		int[][] res=t.suffelArray(new int[] {1,2,3});
		
		
		for(int i=0; i<res.length; i++) {
			for(int j=0; j< res.length; j++) {
				System.out.println(res[i][j]);
			}
		}

	}

}
