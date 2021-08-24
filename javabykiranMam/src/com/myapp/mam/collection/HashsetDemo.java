package com.myapp.mam.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class HashsetDemo {

	public static void main(String[] args) {
	HashSet <Integer> set=new HashSet<Integer>();
	set.add(10);
	set.add(8);
	set.add(12);
	set.add(5);
	System.out.println(set);//display Ascending order
	
	LinkedHashSet<Integer> hset= new LinkedHashSet<Integer>();
	
	hset.add(15);
	hset.add(1);
	hset.add(5);
	hset.add(10);
	System.out.println(hset);//display Insertion order
	}

}
