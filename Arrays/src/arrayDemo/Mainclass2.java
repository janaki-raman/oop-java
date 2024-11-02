package arrayDemo;

public class Mainclass2 
{
	public static void main(String[] args) 
	{
		int arr1[][]= {{1,2,3},{4,5,6},{7,8,9}};
		//int[][]arr=new int[3][3];
		//int[][]arr=new int[][] {{1,2,3},{4,5,6},{7,8,9}};
		//int[][]arr=new int[3][5];
		
		//jagged array
		int[][]arr2= {{1,2,3,4,5},{2,3,4,5},{3,4,5,6,7,8,9,1}};
		System.out.println(arr2.length);
		
		for(int i=0;i<arr2.length;i++)
		{
			for(int j=0;j<arr2[i].length;j++)
			{
				System.out.print(arr2[i][j]+" ");
			}
			System.out.println();
		}
	}
}
