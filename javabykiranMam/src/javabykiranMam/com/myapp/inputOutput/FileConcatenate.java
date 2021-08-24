package javabykiranMam.com.myapp.inputOutput;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.SequenceInputStream;

public class FileConcatenate {

	public static void main(String[] args) throws Exception {
		FileInputStream input1 = new  FileInputStream("C://Users//planet//Desktop//Demo//test.txt");
		FileInputStream input2=new FileInputStream("C://Users//planet//Desktop//Demo//readerfile.txt");
		
		SequenceInputStream inst = new SequenceInputStream(input1, input2);
		
		int j;
		while((j=inst.read())!=-1)
		{
			System.out.print((char)j);
		}
		inst.close();
		input1.close();
		input2.close();
		
	}

}
