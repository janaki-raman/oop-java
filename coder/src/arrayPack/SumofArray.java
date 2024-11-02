package arrayPack;

public class SumofArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int A1[]=new int[] {1,2,3,4,5,6};
		
		int sum=0;
		for(int i=0;i<A1.length;i++)
		{
			sum=sum+A1[i];
		}
		System.out.println("Sum of Elements in given Array:"+sum);
	}

}
