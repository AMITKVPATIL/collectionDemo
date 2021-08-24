package com.myapp.mam.collection.comparator;

public class Student {
	int id;
	String name;
	int salary;
	Student(){

	}
	public Student(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
}
