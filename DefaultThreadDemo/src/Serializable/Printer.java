package Serializable;

import java.io.PrintWriter;

public class Printer {
	PrintWriter pw;
	public Printer() {
		pw =new PrintWriter(System.out,true);
	}
	public synchronized void print(String header,String body,String footer) {
		try 
		{
			pw.println(header);
			Thread.sleep(500);
			pw.print(body);
			Thread.sleep(500);
			pw.print(footer);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
