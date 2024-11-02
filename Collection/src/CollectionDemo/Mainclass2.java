package CollectionDemo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Mainclass2 
{
	public static void main(String[] args) 
	{
		//List names=new ArrayList();
		//List names=new Vector();
		List names=new LinkedList();
		
		names.add("Ajith");
		names.add("Vijay");
		names.add("GP Muthu");
		names.add("Ajith");
		//names.add(null);
		
		names.add(1,"YogiBabu");
		names.add(2,"Power Star");
		
		System.out.println(names.subList(2,4));
		
		for(int i=0;i<names.size();i++)
		{
			Object o1=names.get(i);
			String name=(String)o1;
			System.out.println(name+"-->"+name.charAt(0));
		}
	}
}
