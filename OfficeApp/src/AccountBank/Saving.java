package AccountBank;


public class Saving extends Account {
	
	private static double int_rate;
	
	static 
	{
		int_rate = 4.3;
	}

	public Saving() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Saving(int acc_no, String name, int balance) {
		super(acc_no, name, balance);
		// TODO Auto-generated constructor stub
	}

	public void withdraw(double amt) {
		System.out.println("*****************************");
		if(amt > balance)
			System.out.println("Insufficient balance");
		
		else if(amt<balance-1000)
		{
			balance-=amt;
			System.out.println("balance="+balance);
		}
		else if(amt>balance-1000) {
			System.out.println("Only"+(balance-1000)+"can be withdrawn");
		}
		// TODO Auto-generated method stub
		
	}

	


}
