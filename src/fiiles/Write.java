package fiiles;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Write {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Define path
		
	     String filename = "E:\\Learning\\Java Basics\\FileToWrite.txt";
	     String message = "Written from Write java2";
	     File file = new File(filename);
	     
	     try {
			FileWriter fw = new FileWriter(file);
			fw.write(message);
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("ERROR: Couldnot write to the file");
			e.printStackTrace();
		}
	     finally {
	    	 
	    	 System.out.println("Closing file");
	     }
		
		//Create the file
		
		//Open the file
		
		//Write to the file
		
		//Close resources

	}

}
