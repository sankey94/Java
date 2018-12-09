package AccountBank;

public abstract class Account 
{
	private int acc_no;
	private String name;
	protected double balance;
	
	
	public Account() {
		super();
	}
	public Account(int acc_no, String name, int balance) 
	{
		super();
		this.acc_no = acc_no;
		this.name = name;
		this.balance = balance;
	}
	public void display()
	{
		System.out.println("Accoutn No ="+acc_no);
		System.out.println("Account Name ="+name);
		System.out.println("Balance="+balance);
		
		
	}
	public abstract void withdraw(double amt);

	

}
