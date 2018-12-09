package Treeset;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Custdemo {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Set<TreeCust> stlist=new TreeSet<>();
		
		Set<TreeCust> stlist2=new TreeSet<>(new TreeCust());
		stlist2.add(new TreeCust(1,"z","pune","abcd"));
		stlist2.add(new TreeCust(3,"o","mumbai","asas"));
		stlist2.add(new TreeCust(12,"p","kanpur","asasas"));
		stlist2.add(new TreeCust(16,"q","nagpur","sasas"));
		System.out.println(stlist2);
		
	}

}
class CustomerComparator implements Comparator<TreeCust>{

	@Override
	public int compare(TreeCust o1, TreeCust o2) {
		return o1.getName().compareTo(o2.getName());
		// TODO Auto-generated method stub
	}

	
	
}
