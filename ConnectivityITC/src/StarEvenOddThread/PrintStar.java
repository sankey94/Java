package StarEvenOddThread;

public class PrintStar 
{
	int i=16;
	private Thread t;
	public Thread getT() {
		return t;
	}
	public void setT(Thread t) {
		this.t = t;
	}
	boolean brun;
	public synchronized void evenStars() 
	{
		synchronized (this) 
		{
		for(i=0;i<15;i++) 
		{
			if(i%2==0) 
			{
				System.out.print("*");
			}
		}
	}	
}
	public  synchronized void oddStars() 
	{
		synchronized (this) 
		{
			for(i=0;i<15;i++) 
			{
				if(i%2!=0) 
				{
					System.out.println("*");
				}	
			}
		}
	}

}
