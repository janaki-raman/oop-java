package CollectionDemo;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
public class Mainclass4 
{
	public static void main(String[] args) 
	{
		Map map=new HashMap();
		
		map.put("1","one");
		map.put("2","two");
		map.put("3","three");
		map.put(10,"one");
		
		//map.clear();
		
		System.out.println(map.size());
		System.out.println(map.isEmpty());
		System.out.println(map.containsKey("2"));
		System.out.println(map.containsValue("three"));
		System.out.println(map.get("3"));
		System.out.println(map.getOrDefault("13","THREE"));
		System.out.println(map.keySet());
		System.out.println(map.values());
		System.out.println(map.entrySet());
		System.out.println(map);
		
		Set Keys=map.keySet();
		
		for(Object key:Keys)
		{
			System.out.println(key+"-->"+map.get(key));
		}
	}
}
