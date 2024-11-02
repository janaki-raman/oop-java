package CollectionDemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
public class Mainclass1 
{
	public static void main(String[] args) 
	{
		Collection c1=new ArrayList();
		
		c1.add("abc");
		c1.add(new StringBuffer("SB"));
		c1.add(new pen());
		//c1.clear();
		//c1.remove("abc");
		
		System.out.println(c1.size());
		System.out.println(c1.isEmpty());
		System.out.println(c1.contains("abc"));
		
		System.out.println("------------------");
		
		for(Object o1:c1)
		{
			System.out.println(o1);
		}
		
		System.out.println("------------------");
		
		Iterator itr=c1.iterator();
		while(itr.hasNext())
		{
		 Object o1=itr.next();
		 System.out.println(o1);
		}
		
	}
}
