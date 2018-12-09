package Treeset;

import java.util.*;

public class TreeCust implements Comparator<TreeCust> {
	private int cid;
	public String name;
	public String city;
	public  String email_id;


	public TreeCust() {
	}

	public TreeCust(int cid, String name, String city, String email_id) {
		super();
		this.cid = cid;
		this.name = name;
		this.city = city;
		this.email_id = email_id;
	}

	public String getCity() {
		return city;
	}

	@Override
	public String toString() {
		return "TreeCust [cid=" + cid + ", name=" + name + ", city=" + city + ", email_id=" + email_id + "]";
	}
	//@Override
	/*public int compareTo(TreeCust o) {
		// TODO Auto-generated method stub
		return this.getCity().compareTo(o.getCity());
	}*/
	public String getName() {
		return name;
	}
/*	@Override
	public int compare(TreeCust o1, TreeCust o2) 
	{
		return o1.getName().compareTo( o2.getName());
	}
*/

	@Override
	public int compare(TreeCust o1, TreeCust o2) {
		// TODO Auto-generated method stub
		return 0;
	}

}



	

