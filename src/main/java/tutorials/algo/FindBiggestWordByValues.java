package src.main.java.tutorials.algo;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/** 
 * @author pankajpkm 
 * @email pankajkumarcse02@gmail.com 
 *
 */
public class FindBiggestWordByValues {
	
	/*** 
	 * @param String
	 * @return biggest Word by values
	 *  
	 */
	private String findBiggestWordByValues(String str){
		int lastElement=0;
		Map<Integer, String> wordsWithSum=processTheString(str);
		Iterator<Integer> itr = wordsWithSum.keySet().iterator();
		while(itr.hasNext()) {
			lastElement=itr.next();
		}		
		return wordsWithSum.get(lastElement);
	}
	
	private Map<Integer, String> processTheString(String str) {
		Map<Integer, String> wordsWithSum= new TreeMap<Integer, String>();
		for(int i=0; i<str.split(" ").length; i++){
			String word =str.split(" ")[i];
			int sumOfWord=0;
			char[] charArray=word.toCharArray();
			for(char chr:charArray){
				int ASCII=Integer.valueOf(chr);
				sumOfWord+=ASCII;
			}
			wordsWithSum.put(sumOfWord, word);
		}
		return wordsWithSum;
	}
	
	/*** 
	 * @param String
	 * @return biggest Word by values
	 *  More Efficient way
	 */
	static String findBiggestWordByValues1(String str) {
		int mx = 0;
		String ans = "";
		for(String s : str.split(" ")) {
			int sum = 0;
			for(char chr : s.toCharArray())
				sum += Integer.valueOf(chr);
			
			if(sum > mx) {
				mx = sum;
				ans = s;
			}
		}
		return ans;
	}

	public static void main(String[] args){
		FindBiggestWordByValues fbwbv= new FindBiggestWordByValues();
		System.out.println(fbwbv.findBiggestWordByValues("I am Pankaj Kumar works at ObjevSoft"));
		System.out.println(findBiggestWordByValues1("I am Pankaj Kumar works at ObjevSoft"));
	}
}
