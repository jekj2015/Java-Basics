package basics;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 8;
		
		System.out.println("Fibonocci for  " + n + " is " + calcFib(n));
		
		
		
		
		
		
	}
	
	
	public static int calcFib(int x)
	{
		
		if(x == 0)
		{
			return 0;}
		else if (x == 1)
		    {
			return 1;
		    }
		
		else 
			{
			
			return (calcFib(x-1) + calcFib(x-2));
			}
		
	}

}
