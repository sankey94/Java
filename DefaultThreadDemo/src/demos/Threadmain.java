package demos;

public class Threadmain {

	public static void main(String[] args) {
		System.out.println("Counting down begins......");
		
		// TODO Auto-generated method stub
		CountDownJob j1=new CountDownJob(50);
		j1.t.start();

	}

}
