package javabykiranMam.com.myapp.inputOutput;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TranferFileData {

	public static void main(String[] args) {
		FileReader r=null;
		FileWriter w=null;
		try {
			r=new FileReader("C://Users//planet//Desktop///Demo//readerfile.txt");
			w=new FileWriter("C://Users//planet//Desktop//Demo//text2.txt");
			int c;

			while((c=r.read())!=-1)
			{
				System.out.print((char)c);
				w.write(c);
			}
		}catch(FileNotFoundException e)
		{
		System.out.println("File not Found");	
		} catch (IOException e) {
			System.out.println("IO Exception");
			e.printStackTrace();
		}
		finally {
			if(r==null)
			{
				System.out.println(" r File is empty");
			try {
				r.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
			if(w==null)
			{
				System.out.println("w filr empty");
			try {
				w.close();
			}catch(IOException e)
			{
				e.printStackTrace();
			}
			}
		
		}
	}

}
