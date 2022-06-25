package src.main.java.tutorials.misc;

public class Test7 {

	// [2,4,6,8,3,5]
	// %2 ==0 even , %2 ==1 odd

	public boolean newArrayContains(int[] arr, int num) {
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==num) {
				return true;
			}
				
		}
		return false;
	}
	
	public int[] processArray(int[] arr) {
		int len = arr.length;
		int[] newArr = new int[len];

		for (int i = 0; i < len; i++) {
			if (i % 2 == 0) {
				for (int j = 0; j < len; j++) {
					if (arr[j] % 2 == 0) {
						if(newArrayContains(newArr,arr[j]))
							continue;
						else {
							newArr[i] = arr[j];
							break;
						}
					}
				}
			} else {
				for (int j = 0; j < len; j++) {
					if (arr[j] % 2 == 1) {
						if(newArrayContains(newArr,arr[j]))
							continue;
						else {
							newArr[i] = arr[j];
							break;
						}
						
					}
				}
			}
		}
		return newArr;
	}

	public static void main(String[] args) {
		int[] arr = new int[] { 4, 2, 5, 7,6,8,9,3};
		int[] output = new Test7().processArray(arr);

	}

}
