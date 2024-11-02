package arrayPack;

import java.util.Arrays;

public class SmallestInArrayExample2 {
	
	public static int getSmallestNumber(int a[],int total) {
		Arrays.sort(a);
		return a[0];
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {89,66,56,43,68};
		int b[]= {2,4,9,7,9};
		
		System.out.println("SmallestNumber:"+getSmallestNumber(a,a.length));
	    System.out.println("SmallestNumber:"+getSmallestNumber(b,b.length));

	}

}
