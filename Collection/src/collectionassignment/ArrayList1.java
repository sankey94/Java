package collectionassignment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class ArrayList1 {

	public static void main(String[] args) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		BufferedReader br1= new BufferedReader(new InputStreamReader(System.in));
		List<String> name= new ArrayList<>();
		String names;
		
/*		for(int i=0;i<=6;i++)
		{
			names=br.readLine();
			name.add(names);
		}	*/
		System.out.println(name);
		Collections.sort(name);
		
		System.out.println(name);
		Collections.reverse(name);
		System.out.println(name);
		System.out.println("Enter the string");
		String key=br1.readLine();
		if(name.contains(key))
		{		
			System.out.println(name.indexOf(key));
		    
		}
	}

}
