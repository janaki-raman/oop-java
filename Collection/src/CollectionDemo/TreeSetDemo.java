package CollectionDemo;

import java.util.TreeSet;

public class TreeSetDemo 
{
	public static void main(String[] args) {
		
		TreeSet set=new TreeSet();
		
		set.add("Kuberan");
		set.add("Shruthihassan");
		set.add("Devraj");
		
		set.add("Kuberan");
		
		set.add(new StringBuffer("abc"));
		set.add(null);
		System.out.println(set);
	}
}
