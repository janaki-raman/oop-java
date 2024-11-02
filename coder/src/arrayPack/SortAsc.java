package arrayPack;

public class SortAsc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int A1[]=new int[] {7,8,2,3,1,6};
		
		System.out.println("original order of array:");
		for(int i=0;i<A1.length;i++)
		{
			System.out.print(A1[i]+" ");
		}
		
		int temp=0;
		for (int i=0;i<A1.length;i++)
		{
			for(int j=i+1;j<A1.length;j++)
			{
				if(A1[i]>A1[j])
				{
					temp=A1[i];
					A1[i]=A1[j];
					A1[j]=temp;
				}
			}
		}
		
		System.out.println();
		
		System.out.println("Asccending order of Array:");
		for(int i=0;i<A1.length;i++)
		{
			System.out.print(A1[i]+" ");
		}
		

	}

}
