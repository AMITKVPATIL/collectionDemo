package javabykiranMam.com.myapp.inputOutput;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadCharFromFile {

	public static void main(String[] args) throws IOException {
		
		FileReader fr = new FileReader("C://Users//planet//Desktop//Demo//test.txt");
		int c=0;
		while((c=fr.read())!=-1)
		{
		System.out.print((char)c);	
		}
		
		fr.close();
	}

}
