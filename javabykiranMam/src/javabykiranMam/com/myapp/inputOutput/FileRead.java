package javabykiranMam.com.myapp.inputOutput;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileRead {
public static void main(String[] args) throws IOException {
	
	int ch;
	FileReader fr=null;
	try
	{
		fr=new FileReader("drive link selenium software.txt");
		
		
	}catch(FileNotFoundException e)
	{
		System.out.println("File not Found");
	}
	while((ch=fr.read())!=-1)
	{
		
		System.out.print((char)ch);
		
	}
	fr.close();
}
}
