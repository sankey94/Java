import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Filecopy implements Runnable {
	public static void main(String args[]) throws IOException {
		
	
	BufferedReader br1=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter Source:");
	
	BufferedReader br2=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter Destiation:");
	String destination=br1.readLine();
	Filecopy fc=new FileCopyThread()
	Thread t;

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
}
