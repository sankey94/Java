package Demo;

public class Stock 
{
	int qtyProduced;
	int qtyConsumed;
	boolean bProduced;
	
	public Stock() {
		qtyProduced=qtyConsumed=0;
		bProduced=false;
	}
	public void produce() {
		if(bProduced)
		{
			if(qtyProduced>qtyConsumed)
				consume();
				
			
		}
		
		qtyProduced++;
		System.out.println("Produced:"+qtyProduced);
		bProduced=true;
		if(qtyProduced>qtyConsumed)
			consume();
		
		
	} 
	public void consume() {
		if(!bProduced){
			if(qtyProduced<qtyConsumed)
				produce();
			
			
		}
		qtyConsumed++;
		System.out.println("Consumed:"+qtyConsumed);
		bProduced=false;
		if(qtyProduced<qtyConsumed)
			produce();
		}
	}
	

