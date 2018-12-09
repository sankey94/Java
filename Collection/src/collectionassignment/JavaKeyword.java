package collectionassignment;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class JavaKeyword 
{
	public static void main(String args[]) throws Exception 
	{
		BufferedReader br= new BufferedReader(new FileReader("/home/student/file.java"));
        List<String> name= new ArrayList<>();
        String str;
        while((str=br.readLine())!=null)
        {
        	StringTokenizer st=new StringTokenizer(str," ");
        	while(st.hasMoreTokens()) 
        	{
        		if(str .equals(" ")) 
        			name.add(st.nextToken());
        	}
        }
        System.out.println(name);
	}

}
