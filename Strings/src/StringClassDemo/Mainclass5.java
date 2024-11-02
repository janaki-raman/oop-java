package StringClassDemo;

public class Mainclass5 
{
	public static void main(String[] args) 
	{
		StringBuffer sb1=new StringBuffer("abc");
		StringBuffer sb2=new StringBuffer("abc");
		
		System.out.println(sb1);
		System.out.println(sb2);
		
		System.out.println(sb1.hashCode());
		System.out.println(sb2.hashCode());
		
		System.out.println(sb1.equals(sb2));
		
		sb1.append("xyz");
		System.out.println(sb1);
		
		sb1.insert(2,"pqr");
		System.out.println(sb1);
		
		sb2.reverse();
		System.out.println(sb2);
	}

}
