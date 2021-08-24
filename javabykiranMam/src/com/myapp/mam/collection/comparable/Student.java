package com.myapp.mam.collection.comparable;

public class Student implements Comparable<Student>{
	int id;
	String name;
	float per;

	Student(){

	}

	public Student(int id, String name, float per) {
		super();
		this.id = id;
		this.name = name;
		this.per = per;
	}

	/*@Override
	public int compareTo(Student s1) {
	if(this.id>s1.id)
		return 1;
	else if(this.id<s1.id)
		return -1;
	else //if(this.id==s1.id)
		return 0;
	}
	*/

 @Override
 public int compareTo(Student s1)
 {
 return (this.name).compareTo(s1.name);
 }
 
 
 
 
 
}
