package CollectionDemo;


public class Employee implements Comparable
{
	

	int id;
	String name;
	double salary;
	
	public Employee(int id,String name,double salary) {
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	
	
	@Override
	public String toString() {
		return "Employee[id="+id+",name="+name+",salary="+salary+"]";
	}
	
	
	public int hashcode() {
		return id;
	}
	
	
	public boolean equals(Object o1) {
		return (this.hashcode()==o1.hashCode());
	}
	
	
	@Override
	public int compareTo(Object o1) {
		return this.hashcode()-o1.hashCode();
	}
}
