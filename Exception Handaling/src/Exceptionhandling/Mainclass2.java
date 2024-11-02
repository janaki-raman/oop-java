package Exceptionhandling;

public class Mainclass2 
{
  public static void main(String[] args) 
  {
	  System.out.println("****************");
	  
	  try
	  {
		  //code causes the Exception
		  System.out.println("before Exception...");
		  System.out.println(10/0);
		  System.out.println("after Exception...");
	  }
	  catch(Exception e1)
	  {
		  //solution code
		  System.out.println("i am in catch...");	  
	  }
	  finally
	  {
		  //Mandatory code
		  System.out.println("i am in finally...");
	  }
	  
	  System.out.println("****************");
  }
}
