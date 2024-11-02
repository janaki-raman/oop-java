package arrayPack;

public class EvenPositionArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int A1[]=new int[] {1,2,6,8,9,5,3};
		
		System.out.println("even position value in Array:");
		
		for(int i=1;i<A1.length;i=i+2)
		{
			System.out.println(A1[i]);
		}

	}

}
