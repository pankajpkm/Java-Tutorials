package src.main.java.tutorials.misc;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Test3 {

	public Map<String, Integer> getAlphabetsWithCount(String str){
		Map<String, Integer> map = new HashMap<>();		
		if(str.length()<0)
		return null;
		
		for(int i=0; i<str.length(); i++){
			String key = String.valueOf(str.charAt(i));
			if(map.containsKey(key)){				
				map.put(key, (map.get(key)+1));
			}
			map.put(key, 1);
		}
		return map;
	}
	public static void main(String[] args) {
		Test3 t = new Test3();
		Map<String, Integer> map = t.getAlphabetsWithCount("Welcome Pankaj");
		for(Entry<String, Integer> etry : map.entrySet()) {
			if(etry.getValue()>1) {
				System.out.println(etry.getKey() +" : "+ etry.getValue());
			}
		}

	}

}
