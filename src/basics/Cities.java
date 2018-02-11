package basics;

public class Cities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] cities = {"New York" , "Dallas","Miami"};
		System.out.println("First city is " + cities[0]);
		
		
		String[] states = new String[5];
		states[0] = "California";
		states[1] = "Utah";
		states[2] = "Nevada";
		states[3] = "Alaska";
		states[4] = "Florida";
		for(int i=0;i<5;i++)
		{
		System.out.println("State is "+states[i]);
		
		}
		
		String[] Countries;
		Countries = new String[5];
				Countries[0] = "India";
				Countries[1] = "USA";
				Countries[2] = "Canada";
				Countries[3] = "UK";
				Countries[4] = "Bhutan";
				
				boolean countryfound = false;
				int j = 0;
				
				while(!countryfound )
				{
					
						System.out.println("Country is "+Countries[j]);
				
				  if(Countries[j]== "Bhutan");
				 { 
					  countryfound = true;
					  System.out.println("Country Found ");
					  
				  }
				  
				  j++;
				  
				}
				
				for (int i = 0; i< 5 ;i ++)
				{
					System.out.println("Country from FOR is "+Countries[i]);
				}
		

	}

}
