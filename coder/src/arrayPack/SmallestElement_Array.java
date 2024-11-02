package arrayPack;

public class SmallestElement_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int A1[]=new int[] {5,78,5,4,2,9};
		int small=A1[0];
		for(int i=0;i<A1.length;i++)
		{
			if(A1[i]<small)
				small=A1[i];
		}
		System.out.println("Smallest Element in Array:"+small);

	}

}
