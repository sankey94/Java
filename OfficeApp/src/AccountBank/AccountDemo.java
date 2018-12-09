package AccountBank;

public class AccountDemo {

	public static void main(String[] args) {
		Account a1=new Saving(123,"Sanket",100000) ;
		a1.withdraw(10000);
		a1.withdraw(15000);
		a1.withdraw(100000);
		Account a2= new Current(223,"Rajesh",75000);
		a2.withdraw(15000);
		a2.withdraw(15000);
		a2.withdraw(15000);
		a2.withdraw(15000);
		a2.withdraw(15000);
		a2.withdraw(15000);
		Account a3= new Recurring(122,"Mangesh",15000);
				a3.withdraw(10000);
				
		
				
		
			
		// TODO Auto-generated method stub

	}

}
