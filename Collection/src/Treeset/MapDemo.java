package Treeset;

import java.util.*;

public class MapDemo {

	public static void main(String[] args) 
	{
		Map <Integer,String> map= new HashMap<>();
		map.put(1,"ab");
		map.put(8,"abfg");
		map.put(5,"abfhfggj");
		map.put(34,"abill");
		Set<Map.Entry <Integer,String>> set=map.entrySet();
		Iterator<Map.Entry<Integer,String>> i= set.iterator();
		while(i.hasNext())
		{
			Map.Entry me=i.next();
			System.out.println(me.getKey()+":" +me.getValue());
		}
		for(Map.Entry<Integer,String> me:set)
		{
			System.out.println(me.getKey()+":" + me.getValue());
		}
	}

}
