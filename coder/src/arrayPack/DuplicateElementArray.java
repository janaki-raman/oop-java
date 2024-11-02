package arrayPack;

public class DuplicateElementArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int A1[]=new int[] {1,2,3,3,2,4,5,6,7};
		
		System.out.println("duplicate element in Array:");
		
		for(int i=0;i<A1.length;i++)
		{
			for(int j=i+1;j<A1.length;j++)
			{
				if (A1[i]==A1[j])
				{
					System.out.println(A1[i]);
				}
			}
		}

	}

}
