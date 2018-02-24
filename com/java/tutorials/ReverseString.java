package com.java.tutorials;

public class ReverseString {
	
	//Method 1 - Reverse String Using Char index
	public String reverseByChr(String s){
		char[] chr = s.toCharArray();
		int first=0;
		int last=chr.length-1;
		char temp;
		while(last>first){
			temp=chr[first];
			chr[first]=chr[last];
			chr[last]=temp;
			first++;
			last--;
		}	
		return new String(chr);
		
	}
	//Method 2 - Reverse String Using StringBuffer with "For loop"
	public String reverseByStrBuff1(String s){
		int i, len=s.length();
		StringBuffer sb = new StringBuffer(len);
		for(i=(len-1); i>=0; i--){
			sb=sb.append(s.charAt(i));
			}
		return sb.toString();
	}
	//Method 3 - Reverse String Using StringBuffer Reverse() method
	public String reverseByStrBuff2(String s){
		StringBuffer sb = new StringBuffer(s);
		sb.reverse();
		
		return sb.toString();
	}


	public static void main(String[] args){
		ReverseString rev= new ReverseString();
		String revChar = rev.reverseByChr("Hello Char");
		String revStr1 = rev.reverseByStrBuff1("Hello Pankaj");
		String revStr2 = rev.reverseByStrBuff2("Hello Pankaj");
		
		System.out.println("Revresed by char index : " +revChar.toUpperCase());
		System.out.println("Reversed by for loop : " +revStr1.toUpperCase());
		System.out.println("Reversed by reverse method : " +revStr2.toUpperCase());
		
		
		String a="Hello", b="Pankaj";
		System.out.println("Befor Swaping \n"+"a : " +a + "\nb : " +b);
		a=a+b;
		//System.out.println(a);
		
		b= a.substring(0, a.length()-b.length());
		a= a.substring(b.length());
		System.out.println("Alfre Swaping \n"+"a : " +a + "\nb : " +b);
	}

}
