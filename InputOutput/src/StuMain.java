import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StuMain {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      int rollno=Integer.parseInt(br.readLine());
      String name=br.readLine();
      float percent=Float.parseFloat(br.readLine());
      
      StudentIO i=new StudentIO(rollno,name,percent);
      System.out.println(i);
      
      
      
    
      
      


	}

}
