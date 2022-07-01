package fileio;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

// Writer class used to write String/text data in to a text file
public class WriterExample {

	public static void main(String[] args) {
	
		try
		{
			Writer w=new FileWriter("c:/demo/data.txt");
			
			String content="She Sells Sea Shells In The Sea. Programming by Raj";
			
			w.write(content); //write contents in to file
			w.close();
			System.out.println("Data Writen to a File");
			
		}
		catch(IOException e)
		{
			System.err.println("Error Occurred");
			e.printStackTrace();
		}

	}

}
