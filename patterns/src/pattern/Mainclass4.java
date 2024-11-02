package pattern;

public class Mainclass4 
{
	
	public static void main(String[] args) 
	{
		System.out.println("*********");

		
        for(char ch='A';ch<='D';ch++) 
		{
          for(char ch2=ch;ch2<='C';ch2++) 
	      {
           System.out.print(" ");
          }

          for(char ch3='A';ch3<=ch;ch3++) 
		  {
           System.out.print(ch3);
          }
          
        
          for(char ch4=--ch;ch4>'A';ch4--) 
		  {
           System.out.print(ch4);
          } 
         

          System.out.println();
		}
		System.out.println("*********");
	}

}
