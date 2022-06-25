package src.main.java.tutorials.misc;

public class Test4 {

	//input - jsOn WitH jaVA ProgRamMinG
	//output - jsonWithJavaProgramming

	public String getStringInCamelCase(String str) {
		String[] strArr = str.split(" ");
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < strArr.length; i++) {			
			sb.append(strArr[i].toLowerCase().matches(""));
		}
		return sb.toString();
		
	}
	
  /*1
	1 2
	1 2 3
	1 2 3 4
	1 2 3 4 5*/
	
	public void print(int n) {
		for(int i=0; i<=n; i++) {
			for(int j=0; j< i; j++) {
				System.out.print((j+1));
				for(int k=0; k<=j; k++) {
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
	}

	
	public static void main(String[] args) {
		Test4 t = new Test4();
		t.print(6);

	}

}
