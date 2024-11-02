package arrayPack;

import java.util.Arrays;

public class ThirdLargestInArrayExample2 {
	
	public static int getThirdLargest(int a[],int total) {
		Arrays.sort(a);
		return a[total-3];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {56,78,45,79,26};
		int b[]= {8,9,5,7,3};
		
		System.out.println("thirdLargest:"+getThirdLargest(a,a.length));
		System.out.println("thirdLargest:"+getThirdLargest(b,b.length));

	}

}
