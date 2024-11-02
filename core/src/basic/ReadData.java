package basic;

import java.util.Scanner;

public class ReadData 
{
	public static void main(String[] args) 
	{
		System.out.println("************");
		
		Scanner sc1=new Scanner(System.in);
		
		System.out.println("Enter Name:");
		String name=sc1.next();
		
		System.out.println("Enter ID:");
		int id=sc1.nextInt();
		
		System.out.println("Enter Salary:");
		double salary=sc1.nextDouble();
		
		
		System.out.println("Name= "+name);
		System.out.println("id="+id);
		System.out.println("Salary="+salary);
		

		
		System.out.println("************");
		
	}

}
