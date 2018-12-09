import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCopyThread implements Runnable {
	private Thread t;
	String source;
	String Destination;
	public FileCopyThread( String source, String destination) {
		
		t = new Thread(this);
		this.source = source;
		Destination = destination;
	}
	@Override
	public void run() {
		try {
			BufferedReader fr=new BufferedReader(new FileReader(source));
			BufferedWriter fos1=new BufferedWriter(new FileWriter(Destination));
			//FileOutputStream fos1=new FileOutputStream("/home/student/data2.txt");
			String line;
			while((line=fr.readLine())!=null)
				   fos1.write(line);
			fr.close();
			fos1.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// TODO Auto-generated method stub
		
	}
	
}
