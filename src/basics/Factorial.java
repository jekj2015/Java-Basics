package basics;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 3;
		
		System.out.println("The factorial is " + factorialCalculator(n));

	}

	
	public static int factorialCalculator(int f)
	{
		
		if(f == 1)
		{
			return 1;
		}
			
		else
		{
			
			return (f*factorialCalculator(f-1));
			
		}
		
	}
}
