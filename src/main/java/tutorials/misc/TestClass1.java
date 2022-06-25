package src.main.java.tutorials.misc;

public class TestClass1 {

    public static boolean validParentheses(String braces) {
        char[] arr= braces.toCharArray();
        int sumOfOpen=0;
        int sumOfClose=0;
        if((arr[0]=='(')){
            for(int i=0; i<arr.length; i++){
              if(arr[i]=='(')
                sumOfOpen++;
              else
                sumOfClose++;
            }
            if(sumOfOpen==sumOfClose)
              return true;
            else
              return false;
          }else
            return false;  
    }
	public static void main(String[] ags) {
		System.out.println(validParentheses(")()((())"));
	}
}
