package Demo;

public class Produced implements Runnable {
	private Thread t;
	Stock s;
	boolean bRun;
	
	public Produced(Stock s)
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
	public void run() {
		while(bRun)
			s.produce();
	}
	public void stopNow()
	{
		bRun=false;
		
	}

}
