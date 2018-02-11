package basics;

public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=6;
		
		System.out.println("Sum is " + addNumbers(n) );
		
		

	}
	
	public static int addNumbers(int x)
	{
		if (x == 0)
			return 0;
		
		else 
			
			return(x + addNumbers(x-1));
		
		
	}

}
