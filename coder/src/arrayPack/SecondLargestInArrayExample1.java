package arrayPack;

public class SecondLargestInArrayExample1 {
	
	public static int getSecondLargest(int a[],int total) {
		int temp;
		for(int i=0;i<total;i++) {
			for(int j=i+1;j<total;j++) {
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		return a[total-2];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {7,8,9,4,5};
		int b[]= {99,87,56,45,78};
		System.out.println("SecondLargest:"+getSecondLargest(a,a.length));
		System.out.println("SecondLargest:"+getSecondLargest(b,b.length));

	}

}
