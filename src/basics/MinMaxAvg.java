package basics;

public class MinMaxAvg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numbers [] = {1,8,3,4,5,23};
		System.out.println("Min is :" + Min(numbers));
		System.out.println("Max is :" + Max(numbers));
	}

	public static int Min(int x[])
	{
		int min = x[0] ;
		for(int i =1 ;i < x.length-1 ; i++)
		{
			
			//System.out.println("Array is" + x[i]);
			
	              if(x[i] < min)
	              {
	            	  min = x[i];
	            	  
	              }
	              
	                  
			
			
		}
		
		return min;
		
	}
	
	public static int Max(int x[])
	{
		int max = x[0] ;
		for(int j =0 ;j < x.length ; j++)
		{
			
				
	              if(x[j] > max)
	              {
	            	  max = x[j];
	            	  
	              }
	              
	                  
			
			
		}
		
		return max;
		
	}
	
}
