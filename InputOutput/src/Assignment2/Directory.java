package Assignment2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Directory {
	public static void main(String args[]) throws Exception {
		
		int i;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String filename=br.readLine();
		File f=new File(filename);
		//System.out.println(f.isDirectory());
		
		
		
		if(f.isDirectory()) 
		{
			File[]arr=f.listFiles();
			for(File fr: arr)
				System.out.println(fr.getName());
			
		}
		else if (f.length()<25) {
				FileReader fr=new FileReader(filename);
				while((i=fr.read())!=-1)
					   System.out.print((char)i);
					br.close();	
			}
		else {
			String a;
			BufferedReader bro=new BufferedReader(new FileReader(filename));
			while((a=bro.readLine()) != null)
				System.out.println(a);
		}
		
		
	}

}
