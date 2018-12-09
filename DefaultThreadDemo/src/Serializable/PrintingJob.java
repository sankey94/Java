package Serializable;

public class PrintingJob implements Runnable {

	
	private Thread t;
	Printer p;
	String header;
	String body;
	String footer;
	

	

	public PrintingJob(Printer p, String header, String body, String footer) {
		
		t=new Thread(this);
		this.p = p;
		this.header = header;
		this.body = body;
		this.footer = footer;
	}
	public void run() 
	{
		p.print(header, body, footer);
	}

	public Thread getT() {
		return t;
	}

	
	

}
