package javabykiranMam.com.myapp.inputOutput;

import java.io.File;
import java.io.IOException;

public class CreateFile {

	public static void main(String[] args) {
		//File file=new File("C://Users//planet//Desktop//Demo//test.txt");
		//File file=new File("C://Users//planet//Desktop//Demo//test.jpeg");
		//File file=new File("C://Users//planet//Desktop//Demo//test.mpeg");
	//	File file=new File("C://Users//planet//Desktop//Demo//test.gif");
		File file=new File("C://Users//planet//Desktop//Demo//test.png");
		if(file.exists())
		{
			System.out.println("File allready exists");
			
		}
		else
		{
			try {
				file.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
