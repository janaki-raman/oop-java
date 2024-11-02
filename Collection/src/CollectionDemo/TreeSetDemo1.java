package CollectionDemo;

import java.util.TreeSet;

public class TreeSetDemo1 
{
	public static void main(String[] args) {
		
		TreeSet<Employee>set=new TreeSet<Employee>();
		
		set.add(new Employee(10,"yuvaraj",20000.0));
		set.add(new Employee(5,"Tamil",40000.0));
		set.add(new Employee(12,"yogi",50000.0));
		set.add(new Employee(22,"Karthikeyan",100000.0));
		set.add(new Employee(6,"Nandesh",200000.0));
		
		for(Employee e1:set)
		{
			System.out.println(e1);
		}
		
		System.out.println("-----------------------");
		
		SortbySalary sbs=new SortbySalary();
		TreeSet<Employee>set1=new TreeSet<Employee>(sbs);
		set.addAll(set);
		
		for(Employee e1:set1)
		{
			System.out.println(e1);
		}
	}

}
