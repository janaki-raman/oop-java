package arrayPack;

public class CopyArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] A1={1,2,3,4};
		int[] A2=new int[A1.length];
		
		for(int i=0;i<A1.length;i++)
		{
			A2[i]=A1[i];
		}
       
        System.out.println("element of Array A1:");
        
        for(int i=0;i<A1.length;i++)
        {
        	System.out.print(A1[i]+" ");
        }
        
        System.out.println();
        
        System.out.println("element of Array  A2:");
         
        for(int i=0;i<A1.length;i++)
        {
        	System.out.print(A2[i]+" ");
        }
        
	

}
}
