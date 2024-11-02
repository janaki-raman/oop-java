package arrayPack;

public class LargestElement_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int A1[]=new int[] {1,45,67,76,56};
		
		int max=A1[0];
		for(int i=0;i<A1.length;i++)
		{
			if(A1[i]>max)
				max=A1[i];
		}
		System.out.println("largestElement in Array:"+max);

	}

}
