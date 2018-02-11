package basics;

public class Strings {
	
	public static void main (String[] args)
	{
		
		String bookTitle;
		String word = "will";
		bookTitle = "I will success for sure";
		
		if(bookTitle.contains(word))
		{
			
			System.out.println("Found match for --" + word);
			
		}
		
		
		
		String name = "Jeevan";
		if(name.equalsIgnoreCase("jeevan"))
		{
			System.out.println("Name matches " + name);
			
		}
		
	}

}
