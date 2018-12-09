package AccountBank;

public class Recurring extends Account {
	static double rate;
	static {
		rate=1.04;
	}

	public Recurring() {
		super();
		
		// TODO Auto-generated constructor stub
	}

	public Recurring(int acc_no, String name, int balance) {
		super(acc_no, name, balance);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void withdraw(double amt) {
		System.out.println("**************************");
		System.out.println("Withdrwal is not allowed");
		
		// TODO Auto-generated method stub
		
	}

}
