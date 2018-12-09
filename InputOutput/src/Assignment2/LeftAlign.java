package Assignment2;

import java.io.BufferedReader;

import java.io.FileReader;

public class LeftAlign {

	public static void main(String[] args) throws Exception
	{
		BufferedReader br=new BufferedReader(new FileReader("/home/student/data.txt"));
		BufferedReader br1=new BufferedReader(new FileReader("/home/student/data.txt"));
		String line,line1;
		int max=0;
		while((line=br.readLine())!=null)
		{
			if (max<line.length())
			{
				max=line.length();
			}
		}
		while((line1=br1.readLine())!=null) 
		{
			if(line1.length()<=max) {
				for(int i=0;i<max-line1.length();i++)
				{
					System.out.print("*");
				}
				System.out.println(line1);
			}
		}
		br.close();	
		br1.close();
	}
}
