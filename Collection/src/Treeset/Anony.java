package Treeset;

import java.util.Comparator;



import java.util.*;

public class Anony 
{
	public static void main (String args[])
	{
		
	Set<TreeCust> st1=new TreeSet<>(new Comparator<TreeCust>()
	{
	@Override
	public int compare(TreeCust o1, TreeCust o2) {
         return o1.getName().compareTo(o2.getName());
					}
		});

		st1.add(new TreeCust(12,"dfdf","sdsd","dsds"));
		st1.add(new TreeCust(1,"dfdf","sdsds","sdsd"));
		st1.add(new TreeCust(13,"fdfd","sdsdsd","sdsdsd"));
		System.out.println(st1);
	}		
	

}
