package com.myapp.mam.collection.comparable;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableDemo {

	public static void main(String[] args) {
		
		ArrayList<Student> al=new ArrayList<Student>();
		al.add(new Student(100,"amit",52.6f));
		al.add(new Student(200,"eeet",56.6f));
		al.add(new Student(560,"sss",78.6f));
		al.add(new Student(156,"xxxx",99.6f));
		al.add(new Student(126,"ajit",36.6f));
	
	Collections.sort(al);
	System.out.println(al);

	for(Student s:al)
	{
		
		System.out.println("Student id : "+s.id+" Student name : "+s.name+" Student per : "+s.per);
	}
	}

}
