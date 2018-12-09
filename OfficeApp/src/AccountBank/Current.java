package AccountBank;

public class Current extends Account {

	private double overdraft;
	
	public Current() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Current(int acc_no, String name, int balance) {
		super(acc_no, name, balance);
		// TODO Auto-generated constructor stub
	}

	public void withdraw(double amt) {
		System.out.println("*********************************");
		if(amt<balance)
		{
			balance-=amt;
			System.out.println("Balance="+balance);
			System.out.println("No overdraft balance used");
			
		}
		else if(amt<(balance+overdraft))
		{
			overdraft-=(amt-balance);
			balance=0;
			System.out.println("Overdraft used");
			System.out.println("balace="+balance);
			System.out.println("Overdraft="+overdraft);
		}
		else if(amt >(balance+overdraft)) {
			System.out.println("Cannot Withdraw");
			System.out.println("No sufficient Balace");
		}
		// TODO Auto-generated method stub
		
	}

}
