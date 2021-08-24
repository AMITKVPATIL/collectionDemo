package javabykiranMam.com.myapp.inputOutput;

import java.io.FileWriter;
import java.io.IOException;

public class WriteIntoFile {

	public static void main(String[] args) {
		String str="Contents added to output file";
		FileWriter  fw = null;;
		try {
			fw = new FileWriter("text2.txt");
		} catch (IOException e) {
			System.out.println("File not found");	e.printStackTrace();
		}

		for(int i=0;i<str.length();i++)
		{
			try {
				System.out.print(str.charAt(i));
				fw.write(str.charAt(i));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
		}
	}

}
