package Lab;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class PhoneNumberApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Read a text file
		//Validate ten digit long number
		//Are code cannot start with 0 0r 9
		//There can be 911 in the number
		
		String filename = "E:\\Learning\\Java Basics\\PhoneNumber.txt";
		File file = new File(filename);
		String phonenumber = null;
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			phonenumber = br.readLine();
			System.out.println("Number is " + phonenumber);
			br.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("File not found");
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Could not read file");
			e.printStackTrace();
		}

	}

}
