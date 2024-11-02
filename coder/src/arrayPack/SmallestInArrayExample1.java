package arrayPack;

public class SmallestInArrayExample1 {
	
	public static int getSmallestnumber(int a[],int total) {
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
		return a[0];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {78,96,56,43,23};
		int b[]= {3,7,5,8,2};
		System.out.println("Smallestnumber:"+getSmallestnumber(a,a.length));
		System.out.println("Smallestnumber:"+getSmallestnumber(b,b.length));

	}

}
