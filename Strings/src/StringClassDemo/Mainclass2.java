package StringClassDemo;

public class Mainclass2 
{
	public static void main(String[] args) 
	{
		System.out.println("**********");
		
		String s1="java";
		String s2="java";
		
		String s3=new String("java");
		String s4=new String("java");
		
		System.out.println(s1==s2);
		System.out.println(s3==s4);
		
		System.out.println(s1.equals(s2));
		System.out.println(s3.equals(s4));
		
		System.out.println("**********");
		
	}

}
