package com.myapp.mam.exception;

public class throwExceptionDemo {
	public void throwmethod(){
		System.out.println("demo");
		throw new NullPointerException("null demo");
	}
	public static void main(String[] args) {
	throwExceptionDemo t=new throwExceptionDemo();
		try
	{
		t.throwmethod();
	}catch(NullPointerException e)
		{
		System.out.println("this catch is occure  "+e);
		}
	
	}

}
