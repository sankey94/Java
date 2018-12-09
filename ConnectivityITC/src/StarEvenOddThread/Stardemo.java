package StarEvenOddThread;

public class Stardemo {
	public static void main(String args[]) throws InterruptedException {
		Thread t=new Thread();
		PrintStar ps=new PrintStar();
		ps.evenStars();
		t.sleep(500);
		ps.oddStars();
		
		
	}

}
