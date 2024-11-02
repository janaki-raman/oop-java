package StringClassDemo;

public class Mainclass3 
{
	public static void main(String[] args) 
	{
		String s1="java developer";
		
		String s2="Java";
		
		String s3="java";
		
		System.out.println(s1.length());
		System.out.println(s1.charAt(5));
		System.out.println(s1.indexOf('e'));
		System.out.println(s1.startsWith("java"));
		System.out.println(s1.endsWith("per"));
		System.out.println(s1.contains("dev"));
		System.out.println(s1.substring(5));
		System.out.println(s1.substring(5,12));
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		System.out.println(s1.replace('a', '*'));
		
		char[] ch=s1.toCharArray();
		
		String[] arr=s1.split(" ");
		
		System.out.println(s2.equals(s3));
		System.out.println(s2.compareTo(s3));
		System.out.println(s2.equalsIgnoreCase(s3));
		System.out.println(s2.compareToIgnoreCase(s3));
		System.out.println(s1);
		
	
		
	}

}
