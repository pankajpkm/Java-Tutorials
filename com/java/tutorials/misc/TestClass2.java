package src.main.java;

public class TestClass2 {
	public static String accum(String s) {
     char[] arr= s.toCharArray();
      StringBuilder sb = new StringBuilder();
      for(int i=0; i<arr.length; i++){
        for(int j=0; j<=i; j++){
          if(j==0){
            sb.append(Character. toString(arr[i]).toUpperCase());
          }else
            sb.append(Character. toString(arr[i]).toLowerCase());
        }
        if(i!=arr.length-1)
        	sb.append("-");
      }
      return sb.toString();
    }
	public static void main(String[] args) {
		System.out.println(accum("asBcDer"));
	}

}
