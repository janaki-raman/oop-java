package arrayPack;

import java.util.Arrays;

public class SecondLargestInArrayExample2 {
	
	public static int getSecondLargest(int a[],int total) {
		Arrays.sort(a);
		return a[total-2];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {2,5,7,8,5};
		int b[]= {77,89,65,43,78};
		System.out.println("SecondLargest:"+getSecondLargest(a,a.length));
		System.out.println("SecondLargest:"+getSecondLargest(b,b.length));

	}

}
