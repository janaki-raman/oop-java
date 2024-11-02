package com.kv.app;

public class MainClass2 
{
 public static void main(String[] args) 
 {
	 Student std1=new Student(123,"yuvaraj",99.9);
	 Student std2=new Student(456,"Mahesh",100.0);
	 Student std3=new Student(123,"yuvaraj",99.9);
	 
	 System.out.println(std1);
	 System.out.println(std2);
	 
	 System.out.println(std1.hashCode());
	 System.out.println(std2.hashCode());
	 
	 System.out.println(std1.equals(std2));
	 System.out.println(std1.equals(std3));
 }
}
