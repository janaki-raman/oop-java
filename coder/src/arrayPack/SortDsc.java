package arrayPack;

public class SortDsc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int A1[]=new int[] {6,7,3,4,5};
		
		System.out.println("original values of the array:");
		for(int i=0;i<A1.length;i++)
		{
			System.out.print(A1[i]+" ");
		}
		
		//sorting of array in decending order
		int temp=0;
		for (int i=0;i<A1.length;i++)
		{
			for(int j=i+1;j<A1.length;j++)
			{
			   if(A1[i]<A1[j])
			   {
				   temp=A1[i];
				   A1[i]=A1[j];
				   A1[j]=temp;
			   }
			}
		}
		
		System.out.println();
		
		System.out.println("Array in accending order:");
		for(int i=0;i<A1.length;i++)
		{
			System.out.print(A1[i]+" ");
		}

	}

}
