package src.main.java.test;

public class Test5 {

	/*{
		System.out.println("insideBlock");
	}
	static {
		System.out.println("Inside Static Block");
	}

	Test5() {
		System.out.println("Inside constructor");
	}

	Test5(String str) {
		System.out.println("Inside pram constructor");
	}*/

	
	public static void main(String[] args) {
		/*Test5 t1 = new Test5();
		Test5 t2 = new Test5("Pankaj");*/
		 int number=20;  
		    switch(number){    
		    case 10: System.out.println("10");  
		    System.exit(0);  
		    case 20: System.out.println("20"); 
		    break;
		    case 30: System.out.println("30");  
		    break;  
		     default:System.out.println("Not in 10, 20 or 30"); 
		    }

	}

}
/* O/P - 
   Inside Static Block
   insideBlock
   Inside constructor
   Inside pram constructor
   *
   *20
   */