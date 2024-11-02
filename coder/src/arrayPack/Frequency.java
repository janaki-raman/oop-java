package arrayPack;

public class Frequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]=new int[] {1,2,8,3,2,2,2,5,1};
		//array to store frequency
		
		int fr[]=new int[a.length];
		int visited=-1;
		
		for(int i=0;i<a.length;i++) {
		   int count=1;
		   for(int j=i+1;j<a.length;j++) {
			   if(a[i]==a[j]) {
				   count++;
				   fr[j]=visited;
				   
			   }
		   }
		   if(fr[i]!=visited) {
		} 
    	   
       }
	}

}
