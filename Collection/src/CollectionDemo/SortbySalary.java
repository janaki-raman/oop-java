package CollectionDemo;

import java.util.Comparator;
public class SortbySalary implements Comparator
{

	@Override
	public int compare(Object o1, Object o2) {
		Employee e1=(Employee)o1;
		Employee e2=(Employee)o2;
		
		if(e1.salary>e2.salary)
		 return 5;
		else if(e1.salary<e2.salary)
		 return -5;
		else 
		 return 0;
	}
 
}
