package Demo;

public class ThreadCommDemo {
	
	public static void main (String[] args) {
		Stock s=new Stock();
		
		Produced producer=new Produced(s);
		Consumer consumer=new Consumer(s);
		
		
		producer.getT().start();
		consumer.getT().start();
		try {
			Thread.sleep(700);
		}
		catch(InterruptedException e1) {
			e1.printStackTrace();
		}
		producer.stopNow();
		consumer.stopNow();
		try {
			producer.getT().join();
			consumer.getT().join();
		} catch(InterruptedException e) {
			e.printStackTrace();
		
		}
		System.out.println("Total qty produced:"+s.qtyProduced);
		System.out.println("Total qty consumed:"+s.qtyConsumed);
	}

}
