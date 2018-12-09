package Assignment2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class EmailSegrigator {

	public static void main(String[] args) throws Exception  {
		String line;
		// TODO Auto-generated method stub
		BufferedReader br =new BufferedReader(new FileReader("/home/student/emails.txt"));
		BufferedWriter fos1=new BufferedWriter(new FileWriter("/home/student/data2.txt"));
		while((line=br.readLine())!=null)
		{
				System.out.print(line);
				if(line.contains("gmail.com"))
					  fos1.write(line);
		}			
						// TODO Auto-generated catch block
						//e.printStackTrace();
					
		br.close();	
		fos1.close();
	}

}
