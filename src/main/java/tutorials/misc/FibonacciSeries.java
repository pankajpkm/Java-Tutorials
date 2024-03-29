package src.main.java.tutorials.misc;

public class FibonacciSeries {
	/* F(n)= 0,1,1,2,3,5,8,..
	 * F(n)= if(n>=3) return (n-2)+(n-1)
	 * 		 else return 1
	 */
	public int fibonnaciSeriesNthNumber(int n){
		if(n>=3){
			return fibonnaciSeriesNthNumber(n-2)+fibonnaciSeriesNthNumber(n-1);
		}else{
			return 1;
		}
	}
	
	public int fibUsingRecursion(int n){
		if(n==0) {return 0;}
		if(n<3) {return 1;}
		return fibUsingRecursion(n-2)+fibUsingRecursion(n-1);
	}
	
	public void formFibSeries(int n){
		int firstElement=0, secontElement=1;
		System.out.print("Fibonacci Series of "+n+" is : ");
		for(int i=0; i<=n; i++){
			System.out.print(firstElement+" ");
			int sum = firstElement+secontElement;
			firstElement = secontElement;
			secontElement=sum;
			
		}
	}
	
	public String fibonacciChecker(int n){
		final int lmt=49;
		int firstElement=0, secondElement=1;
		if(n==0 || n==1){return "Yes";}
		for(int i=2; i<lmt ; i++){
			int fn = firstElement+secondElement;
			if(fn==n){return "Yes";}
			firstElement=secondElement;
			secondElement=fn;
		}
		return "No";
	}
	
	public static void main(String[] args) {
		int n=6;
		FibonacciSeries fs= new FibonacciSeries();
		
		System.out.println("-------with recursion nth number ------");
		System.out.println(fs.fibonnaciSeriesNthNumber(n));
		
		System.out.println("-------with recursion series ------");
		System.out.print("Fibonnaci Series of "+n+" is : ");
		for(int i=0; i<=n; i++){
			System.out.print(fs.fibUsingRecursion(i)+" ");
		}
		
		System.out.println("\n-------without recursion ------");
		fs.formFibSeries(n);
		
		System.out.println("\n------Checking number is fibonacci or not-----------");
		System.out.println(fs.fibonacciChecker(56));
	}

}
