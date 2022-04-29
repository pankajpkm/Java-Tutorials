package src.main.java.test;

public class Test12 {

	public boolean isVowel(char c) {
		if(c=='a'||c=='e'||c=='e'||c=='i'||c=='o'||c=='u')
			return true;
		else
			return false;	
	}
	
	public String filterVowel(String s) {
		int len = s.length();
		StringBuffer sb = new StringBuffer();
		for(int i=0; i<len; i++) {
			if(isVowel(s.charAt(i))) 
				sb.append(String.valueOf(s.charAt(i)));
		}
		return sb.toString();
	}
	public String filterConsonant(String s) {
		int len = s.length();
		StringBuffer sb = new StringBuffer();
		for(int i=0; i<len; i++) {
			if(!isVowel(s.charAt(i))) 
				sb.append(String.valueOf(s.charAt(i)));
		}
		return sb.toString();
	}
	
	public static void main(String[] args) {
		String input = "hsdfgggYCX!";
		Test12 t = new Test12();
		System.out.println(t.filterVowel(input));
		System.out.println(t.filterConsonant(input));
	}

}
