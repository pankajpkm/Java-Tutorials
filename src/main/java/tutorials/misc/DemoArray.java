package src.main.java.tutorials.misc;

public class DemoArray {

	public static void main(String[] args) {
		Array array = new Array(3);
		array.insert(10);
		array.insert(20);
		array.insert(30);
		array.insert(40);
		array.insert(50);
		array.insert(60);
		
		/*System.out.println(array.indexOf(10));
		array.print();*/
		
		LinkedList ll = new LinkedList();
		ll.addLast(10);
		ll.addLast(20);
		ll.addLast(30);
		
		ll.addFirst(2);
		ll.deleteFirst();
		ll.deleteLast();
		/*System.out.println(ll.indexOf(50));
		System.out.println(ll);*/
		
		String s ="OneTwoThree";
		String[] strs = s.split("(?=\\p{Upper})");
		
		for(int i=0 ; i< strs.length; i++)
			System.out.println(strs[i] + " : " + (i+1));
	}

}
