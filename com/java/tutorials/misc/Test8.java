package src.main.java.test;


public class Test8 {

	//input :"i Am Pankaj" output : "I am pankaj"
	int add(int a, int b) {
		return a+b;
	}
	
	public String proceesStr(String str) {
		String[] strArr = str.split(" ");

		StringBuffer sb = new StringBuffer();
		for(int i=0; i<strArr.length; i++) {
			System.out.println(strArr[i].charAt(0)+":"+strArr[i].substring(0,1).toLowerCase());
			if(strArr[i].charAt(0)==strArr[i].substring(0,1).toLowerCase().charAt(0)) {
				if(strArr[i].length()>1)
					sb.append(strArr[i].substring(0,1).toUpperCase()+strArr[i].subSequence(1, strArr[i].length()));
				else
					sb.append(strArr[i].toUpperCase());
			}else {
				if(strArr[i].length()>1)
					sb.append(strArr[i].substring(0,1).toLowerCase()+strArr[i].subSequence(1, strArr[i].length()));
				else
					sb.append(strArr[i].toLowerCase());
			}
		}
		/*return sb.toString();
		Character.isLetter(ch)*/
		return str;
		
		/*String[] arr = str.split(" ");
		int index=0;
		StringBuffer sb = new StringBuffer();
		for(int i=0; i<arr.length; i++) {
			sb.append(arr[i]);
			int valueInInt = arr[i].charAt(0);
			if(valueInInt>=97 && valueInInt<122){
				index = 97- valueInInt;
				
			}
		}*/
		
	}
	//97 -122 = 98-97 = 1
	//65 -90 -  = 65+1= 66
	
	public static void main(String[] args) {
		Test8 t = new Test8();
		//System.out.println(t.proceesStr("i Am Pankaj"));
		
		int x=3&5;
		int y = 3|5;
		
		short s=9;
		System.out.println(x+":"+y+":");
		
	}

}
