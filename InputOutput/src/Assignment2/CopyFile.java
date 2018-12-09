package Assignment2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class CopyFile {

	public static void main(String[] args) throws Exception {

		BufferedReader fr=new BufferedReader(new FileReader("/home/student/data.txt"));
		BufferedWriter fos1=new BufferedWriter(new FileWriter("/home/student/data2.txt"));
		//FileOutputStream fos1=new FileOutputStream("/home/student/data2.txt");
		String line;
		while((line=fr.readLine())!=null)
			   fos1.write(line);
		fr.close();
		fos1.close();
		
			
	}

}
