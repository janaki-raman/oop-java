package arrayDemo;

import java.util.Scanner;

public class Mainclass1 
{
	public static void main(String[] args) 
	{
		//int arr[]= {10,20,30};
		//int[] arr= {10,20,30};
		
		//int[]arr=new int[3];
		//double[]arr=new double[3];
		
		//datatype[]var=new datatype[size];//size must be 0 to +ve
		//int[]arr=new int[] {10,20,30};
		
		Scanner sc1=new Scanner(System.in);
		System.out.println("how many number you want to store ?");
		
		int size=sc1.nextInt();
		int[]arr=new int[size];
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("enter"+(i+1)+"element");
			arr[i]=sc1.nextInt();
		}
		
		for (int i=0;i<arr.length;i++)
			
			System.out.println(arr[i]);
		
		System.out.println("______________");
		
		for(int x:arr)
			System.out.println(x);
		
		
		
	}

}
