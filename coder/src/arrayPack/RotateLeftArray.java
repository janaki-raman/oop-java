package arrayPack;

public class RotateLeftArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int A1[]=new int[] {1,2,3,4};
		
		int n=1;
		
		System.out.println("Original Array:");
		
		for(int i=0;i<A1.length;i++)
		{
			System.out.print(A1[i]+" ");
		}
		for(int i=0;i<n;i++) {
		int j,first;
		
		first= A1[0];
		for(j=0;j<A1.length-1;j++)
		{
			A1[j]=A1[j+1];
		}
		A1[j]=first;
		}
		
		System.out.println();
		
		System.out.println("RotateLeftArray:");
		
		for(int i=0;i<A1.length;i++)
		{
			System.out.print(A1[i]+" ");
		}

}
}
