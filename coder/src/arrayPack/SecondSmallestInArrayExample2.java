package arrayPack;

import java.util.Arrays;

public class SecondSmallestInArrayExample2 {
	
	public static int getSecondSmallest(int a[],int total) {
		Arrays.sort(a);
		return a[1];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {4,6,7,9,3};
		int b[]= {88,56,39,78,45};
		System.out.println("SecondSmallest:"+getSecondSmallest(a,a.length));
		System.out.println("SecondSmallest:"+getSecondSmallest(b,b.length));

	}

}
