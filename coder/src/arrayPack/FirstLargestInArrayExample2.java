package arrayPack;

import java.util.Arrays;

public class FirstLargestInArrayExample2 {
	
	public static int getFirstLargest(int a[],int total) {
		Arrays.sort(a);
		return a[total-1];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {78,98,56,76,34};
		int b[]= {2,4,9,7,4};
		
		System.out.println("FirstLargest:"+getFirstLargest(a,a.length));
		System.out.println("FirstLargest:"+getFirstLargest(b,b.length));

	}

}
