package Demo;

public class Consumer implements Runnable {
	private Thread t;
	Stock s;
	boolean bRun;
	
	public Consumer(Stock s)
	{
		bRun=true;
		t=new Thread(this);
		this.s=s;
		
	}
	public Thread getT()
	{
	return t;
	}
	@Override
	public void run()
	{
		while(bRun)
		s.consume();
	}
	public void stopNow()
	{
		bRun=false;
	}
}
