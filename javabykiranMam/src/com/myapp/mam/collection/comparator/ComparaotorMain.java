package com.myapp.mam.collection.comparator;

import java.util.ArrayList;
import java.util.Collections;

public class ComparaotorMain {

	public static void main(String[] args) {
		Student s1=new Student(100,"amit",40000);
		Student s2=new Student(166,"aman",56000);
		Student s3=new Student(111,"sachin",89000);
		Student s4=new Student(105,"tanaji",52000);
		Student s5=new Student(108,"raju",64000);
		ArrayList<Student> al=new ArrayList<Student>();
		
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		al.add(s5);
		
		IdComparator id=new IdComparator();
		
		Collections.sort(al,id);//Sort by using id
		System.out.println("============Sorting by id=================");
//		System.out.println(al);
		
		for(Student s:al)
		{
			System.out.println("Student id : "+s.id+" Student name : "+s.name+" Student salary : "+s.salary);
		}
		
	
		
	NameComparator name=new NameComparator();
		
		Collections.sort(al,name);//Sort by using name
		
//		System.out.println(al);
		System.out.println("============Sorting by name=================");
		for(Student s:al)
		{
			System.out.println("Student id : "+s.id+" Student name : "+s.name+" Student salary : "+s.salary);
		}
		
	
		SalaryComparator salary=new SalaryComparator();
		
		Collections.sort(al,salary);//Sort by using name
		
//		System.out.println(al);
		System.out.println("============Sorting by salary=================");
		for(Student s:al)
		{
			System.out.println("Student id : "+s.id+" Student name : "+s.name+" Student salary : "+s.salary);
		}
		
	}

}
