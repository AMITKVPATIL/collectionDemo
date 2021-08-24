package javabykiranMam.com.myapp.inputOutput;

import java.io.File;

public class GettingFileInfo {

	public static void main(String[] args) {

		File file=new File("C://Users//planet//Desktop//Demo//test.txt");
		System.out.println("file name : "+file.getName());
		System.out.println("Path : "+file.getPath());
		System.out.println("Absolute Path : "+file.getAbsolutePath());
		System.out.println("Parent : "+file.getParent());
		System.out.println("File exists or not : "+file.exists());
		if(file.exists())
		{
			System.out.println("Is writable "+ file.canWrite());
			System.out.println("Is readable "+file.canRead());
			System.out.println("Is a Directory "+file.isDirectory());
			System.out.println("file size in byte "+file.length());
			
		}
	}

}
