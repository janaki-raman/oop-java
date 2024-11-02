package arrayPack;

public class ThirdLargestInArrayExample1 {
	
	public static int getThirdLargest(int a[],int total) {
		
		int temp;
		for(int i=0;i<total;i++) {
			for(int j=i+1;j<total;j++){
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		return a[total-3];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {77,98,54,23,9};
		int b[]= {6,7,3,8,1};
		System.out.println("third largest :"+getThirdLargest(a,5));
		System.out.println("third largest :"+getThirdLargest(b,5));
		}

	}


