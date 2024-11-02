package arrayDemo;

import java.util.Scanner;

public class Mainclass3 
{
	public static void main(String[] args) 
	{
		Scanner sc1=new Scanner(System.in);
		//String arr[]= {"abc",new String("xyz"),"pqr");
		
		/*
		String[]arr=new String[5];
		arr[0]=new String("abc");
		arr[1]="xyz";
		*/
		
		System.out.println("how many names you want to enter");
		
		int size=sc1.nextInt();
		String[]arr=new String[size];
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter"+(i+1)+"name");
			arr[i]=sc1.next();
		}
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]+"\t"+arr[i].length()+"\t"+arr[i].charAt(3));
		}
		
	}
		
}


