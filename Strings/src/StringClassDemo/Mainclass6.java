package StringClassDemo;

import java.util.Scanner;

public class Mainclass6 
{
	public static void main(String[] args) 
	{
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter String");
		String s1=sc1.next();
		
		//convert String to StringBuffer
		
		StringBuffer sb1=new StringBuffer(s1);
		sb1.reverse();
		
		//Convert StringBuffer to String
		//String s2=new String(sb1);
		String s2=sb1.toString();
		
		if(s1.equals(s2))
		 System.out.println("palindrome");
		else
			System.out.println("not a palindrome");
		sc1.close();
	}
}
