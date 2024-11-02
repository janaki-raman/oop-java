package arrayPack;

public class SecondSmallestInArrayExample1 {
	
	public static int getSecondSmallest(int a[],int total) {
		int temp;
		for(int i=0;i<total;i++)
		{
			for(int j=i+1;j<total;j++) {
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		return a[1];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {12,67,89,56,35};
		int b[]= {3,5,6,8,9};
		
		System.out.println("SecondLargest:"+getSecondSmallest(a,a.length));
		System.out.println("secondLargest:"+getSecondSmallest(b,b.length));

	}

}
