package demos;

public class CountDownJob implements Runnable 
{
	int num;
	
	Thread t;
	public CountDownJob(int num) {
		super();
		t=new Thread(this);
		this.num = num;
	}

	@Override
	public void run()
	{
		for(int i = num;i>0;i--) 
		{
			System.out.println("Child Thread Prints:"+num);
			num--;
		}	
	}
}

