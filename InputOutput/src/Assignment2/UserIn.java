package Assignment2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.InputStreamReader;

public class UserIn {
	public static void main(String args[]) throws Exception
	{
	int i;
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	
	FileOutputStream fos=new FileOutputStream("/home/student/data.txt");
	while((i=br.read())!='q')
	   fos.write(i);

	
	BufferedReader fr=new BufferedReader(new FileReader("/home/student/data.txt"));
	String line;
	while((line=fr.readLine())!=null)
		   System.out.print(line);
		br.close();	
}
}
