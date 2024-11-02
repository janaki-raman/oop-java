package CollectionDemo;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Mainclass3 
{
	public static void main(String[] args) 
	{
		//Set set=new HashSet();
		Set set=new LinkedHashSet();
		
		set.add("Nayanthara");
		set.add("Shruthihassan");
		set.add("Sunny");
		set.add("Nayanthara");
		set.add(null);
		set.add(new StringBuffer("Samantha"));
		set.add(new StringBuffer("Samantha"));
		
		for(Object s1:set)
		{
			System.out.println(s1);
		}
	}
}
