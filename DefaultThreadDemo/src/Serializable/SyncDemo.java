package Serializable;

public class SyncDemo {
	public static void main(String args[]) {
		Printer p1=new Printer();
		
		PrintingJob j1=new PrintingJob(p1, "{","Welcome to Java","}");
		PrintingJob j2=new PrintingJob(p1, "[","Learning Multithreading","]");
		PrintingJob j3=new PrintingJob(p1, "(","Threading synchronization",")");
		System.out.println("Printing job begins..........");
		
		j1.getT().start();
		j2.getT().start();
		j3.getT().start();
		try {
			j1.getT().join();
			j2.getT().join();
			j3.getT().join();
		}
		catch (Exception e) {
			// TODO: handle exception
		e.printStackTrace();
		}
	}

}
