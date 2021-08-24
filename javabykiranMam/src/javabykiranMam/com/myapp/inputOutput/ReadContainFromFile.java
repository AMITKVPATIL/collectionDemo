package javabykiranMam.com.myapp.inputOutput;

import java.io.BufferedInputStream;
import java.io.FileInputStream;


public class ReadContainFromFile {

	public static void main(String[] args) {
		try {
			FileInputStream fil=new FileInputStream("drive link selenium software.txt"); 
			BufferedInputStream bf=new BufferedInputStream(fil);
			int i=0;
			while((i=bf.read())!=-1)
			{
			//System.out.print("***");
				System.out.print((char)i);
			}
			bf.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

}
