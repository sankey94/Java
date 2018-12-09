package collectionassignment;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class ListStringSearch {
	public static void main(String[] args)throws Exception {
		List<String> names=new ArrayList<>();
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter number of names");
		int no=Integer.parseInt(br.readLine());
		String name;
		for(int i=0;i<=no-1;i++) 
		{
			name=br.readLine();
			names.add(name);
		}
		System.out.println(names);
		String in;
		System.out.print("Enter String to be searched:");
		in=br.readLine();
		if(names.contains(in)) {
			System.out.println("Present");
		}
		else {
			System.out.println("Not present");
		}
	}

}
