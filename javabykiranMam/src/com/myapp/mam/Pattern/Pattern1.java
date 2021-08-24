package com.myapp.mam.Pattern;

import java.util.Scanner;

public class Pattern1 {
public static void main(String[] args) {
	
	System.out.println("find fictorial number");
	
	Scanner sc=new Scanner(System.in);
	
	System.out.println("enter the number of finding factorial number");
	
	int no=sc.nextInt();
	
	for(int i=2;i<no;i++)
	{
		if(no%i==0)
		{
			System.out.println("the factorial number is : "+i);
			
		}
		
	}
}
}
