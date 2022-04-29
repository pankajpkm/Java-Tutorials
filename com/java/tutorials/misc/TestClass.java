package src.main.java.test;

public class TestClass {

	public int findFact(int num) {
		if(num ==1)
			return 1;
		return num * findFact(num-1);
	}
	static int multiply(int x, int[] res, int res_size)
    {
        int carry = 0; 
        for (int i = 0; i < res_size; i++)
        {
            int prod = res[i] * x + carry;
            res[i] = prod % 10;
            carry = prod/10;
        }
        while (carry!=0)
        {
            res[res_size] = carry % 10;
            carry = carry / 10;
            res_size++;
        }
        return res_size;
    }
	
	 static void factorial(int n)
	    {
	        int[] res = new int[500];
	        res[0] = 1;
	        int res_size = 1;	 
	        for (int x = 2; x <= n; x++)
	            res_size = multiply(x, res, res_size);	 
	        System.out.println("Factorial of given number is ");
	        for (int i = res_size - 1; i >= 0; i--)
	            System.out.print(res[i]);
	    }
	
	public static void main(String[] args) {
		TestClass t = new TestClass();
		System.out.println(t.findFact(10));
		factorial(200);
	}

}
