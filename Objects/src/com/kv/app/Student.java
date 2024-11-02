package com.kv.app;
public class Student implements Cloneable
{
	int id;
	String name;
	double perc;
	public Student(int id, String name, double perc) 
	{
		this.id = id;
		this.name = name;
		this.perc = perc;
	}
	
	public String toString()
	{
		return "[id="+id+",name="+name+",perc="+perc+"]";
	}
	
	public int hashCode()
	{
		return id;
	}
	
	public boolean equals(Object o1)
	{
		return (this.hashCode()==o1.hashCode());
	}
	
	public Student getStudentClone()
	{
		Student ref = null;
		
		try
		{
			ref=(Student)this.clone();
		}catch(CloneNotSupportedException e)
		{
			e.printStackTrace();
		}
		return ref;
	}
	
	public void finalize()
	{
		System.out.println("i am in finalize..!!!");
	}
	
}
