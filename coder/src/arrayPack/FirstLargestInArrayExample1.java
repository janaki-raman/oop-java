package arrayPack;


public class FirstLargestInArrayExample1 {
	
	public static int getFirstLargest(int a[],int total) {
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
		return a[total-1];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {67,89,96,34,75};
		int b[]= {4,7,8,6,9};
		System.out.println("FirstLargest:"+getFirstLargest(a,a.length));
		System.out.println("FirstLargest:"+getFirstLargest(b,b.length));

	}

}
