package fiiles;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Read {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text="";
		//1.Define file path
		String fileName = "C:\\Users\\Jeevan\\Desktop\\file.txt";
		//Create file in Java
		File file = new File(fileName);
		try {
			//read file
        BufferedReader br = new BufferedReader(new FileReader(file));
        text = br.readLine();
        br.close();
		}
		catch(FileNotFoundException  e)
				{
					System.out.println("ERROR:File not found" + e);
				} 
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
        System.out.println(text);
	}

}
