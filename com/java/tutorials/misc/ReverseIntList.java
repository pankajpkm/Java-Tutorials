package src.main.java;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ReverseIntList {
	
	public List<Integer> reverse(List<Integer> list){
		int size = list.size();
		ListIterator<Integer> fwd = list.listIterator();
		ListIterator<Integer> rev = list.listIterator(size);
		
		for(int i=0, j=size-1; i<j ;i++, j--) {
			Integer temp = fwd.next();
			fwd.set(rev.previous());
			rev.set(temp);
		}
				
		return list;
	}
	
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		ReverseIntList rl = new ReverseIntList();
		List<Integer> reversedList = rl.reverse(list);
		System.out.println(reversedList);

	}

}
