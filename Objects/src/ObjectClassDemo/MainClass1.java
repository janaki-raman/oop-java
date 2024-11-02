package ObjectClassDemo;

public class MainClass1 
{
	public static void main(String[] args) 
	{
	  Object o1=new Object();
	  Object o2=new Object();
	  
	  //Explicit call to toString()
	  
	  String s1=o1.toString();
	  System.out.println(s1);
	  System.out.println(o2.toString());
	  
	  //Implicit call to toString()
	  
	  System.out.println(o1);
	  System.out.println(new Object());
	  
	  //hashCode
	  
	  int n1=o1.hashCode();
	  System.out.println(n1);
	  System.out.println(o2.hashCode());
	  
	  //equals
	  
	  boolean res =o1.equals(o2);
	  System.out.println(res);
	  System.out.println(o2.equals(o2));
	  
	}

}
