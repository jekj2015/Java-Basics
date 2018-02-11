package basics;

public class Weather {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int temperature = 80;
		String sunCondition = "Sunny";
		if(temperature > 80)
		{
		System.out.println("Pleasant Weather");
		}
		else if ((temperature  > 60) && (sunCondition == "Sunny"))
		{
			System.out.println("Wear Full sleeves");
			System.out.println("Wear A Hat too");
			
		}
		
		else if( temperature > 50 && sunCondition == "Overcast")
		{
			System.out.println("Bring Jacket and wear warmer cloths");
		}
		
		else
		{
			
			System.out.println("Looks like very cold day");
		}
		
		System.out.println("Program ending");

	}

}
