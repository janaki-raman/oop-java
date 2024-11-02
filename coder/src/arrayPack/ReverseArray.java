package arrayPack;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int A1[]=new int[] {1,2,3,4,5,6};
		
		System.out.println("original Array:");
		
		for(int i=0;i<A1.length;i++)
		{
			System.out.print(A1[i]+" ");
		}
		
		System.out.println();
		
		System.out.println("Reverse Array:");
		
		for(int i=A1.length-1;i>=0;i--)
		{
			System.out.print(A1[i]+" ");
		}

	}

}
