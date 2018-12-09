package demos;

public class Threads extends Thread 
{
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("Thread prints"+i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	

}
