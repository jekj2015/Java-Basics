package exceptionsfiles;

public class CommonExceptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 5;
		int b = 0;
		
		try {
		int c = a/b;
		}
		
		catch(ArithmeticException e) {
			
			System.out.println("ERROR: Cannot divide by Zero" + e.toString());
		}
		System.out.println("Program ending");
		String[] states = {"CA","TX","FL","NV"};
          for(int i = 0;  i<= states.length; i ++)
          {
        		try {System.out.println("State" + states[i]);
        		}
        		
        		catch(ArrayIndexOutOfBoundsException e)
        		{
        			System.out.println("ERROR: Index outside limit" + e.toString());
        		}
        		finally
        		{
        			System.out.println("Program ends");
        		}
        	  
          }
	}

}
