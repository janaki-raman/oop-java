package arrayPack;

public class OddPositionArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int A1[]=new int[] {1,2,6,7,8,5,9};

		System.out.println("OddPosition in Array:");
		
		for(int i=0;i<A1.length;i=i+2)
		{
			System.out.println(A1[i]);
		}
	}

}
