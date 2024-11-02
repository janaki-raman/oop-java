package arrayPack;

public class RotateRightArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int A1[]=new int[] {1,2,3,4,5,6};
		
		int n=1;
		for(int i=0;i<n;i++)
		{
			int first,j;
			
			first=A1[A1.length-1];
			for (j=A1.length-1;j>0;j--)
			{
				A1[j]=A1[j-1];
				
			}
			A1[0]=first;
			
			
		}
		
		System.out.println("Array after right rotation:");
		
		for(int i=0;i<A1.length;i++)
		{
			System.out.print(A1[i]);
		}
		

	}

}
