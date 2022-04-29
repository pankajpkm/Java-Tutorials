package src.main.java.test;

import java.util.HashMap;
import java.util.Map;

public class Test9 {

	public String reverse(String s) {
		int len = s.length();
		if(len <=0)
			return s;
		return s.charAt(len-1)+reverse(s.substring(0,len-1));
	}
	
	public String processString(String s, Map<String, Integer> vowels) {
		int len = s.length();
		StringBuffer sb = new StringBuffer();
		int noOfItr=1;
		for(int i=0; i< len; i++) {	
			if(vowels.containsKey(String.valueOf(s.charAt(i)))) {
				noOfItr=vowels.get(String.valueOf(s.charAt(i)));
				sb.append(String.valueOf(s.charAt(i)));
			}else {
				for(int j=0; j<noOfItr; j++)
					sb.append(String.valueOf(s.charAt(i)));
			}			
		}
		return sb.toString();
	}
	
	//Input String : ABCDEFGHIJKLMNOPQRSTUVWXYZ Vowels : AEIOU
	//ABCDEFFGGHHIJJJKKKLLLMMMNNNOPPPPQQQQRRRRSSSSTTTTUVVVVVWWWWWXXXXXYYYYYZZZZZ
	
	public static void main(String[] args) {
		//System.out.println(new Test9().reverse("Pankaj Kumar"));
		Map<String, Integer> vowels = new HashMap<>();
		vowels.put("A", 1);
		vowels.put("E", 2);
		vowels.put("I", 3);
		vowels.put("O", 4);
		vowels.put("U", 5);
		String input ="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		System.out.println(new Test9().processString(input, vowels));
	}

}
