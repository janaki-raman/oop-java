package pak1;

public class Mainclass1 
{
	public void main(String[] args) 
	{
		Employee1 e1=new Employee1();
		
		e1.setId(1234);
		e1.setName("Nandeesh");
		e1.setSalary(100000.0);
		
		System.out.println(e1.getId());
		System.out.println(e1.getName());
		System.out.println(e1.getSalary());
		
	}

}
