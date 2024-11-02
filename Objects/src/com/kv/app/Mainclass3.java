package com.kv.app;

public class Mainclass3 
{
	public static void main(String[] args) 
	{
		Student std1=new Student(123,"yuvraj",99.9);
		Student std2=std1.getStudentClone();
		
		System.out.println(std1);
		System.out.println(std2);
		
		std1=null;
		std2=null;
		
		System.gc();
		
	}

}
