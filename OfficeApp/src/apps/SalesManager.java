package apps;

public class SalesManager extends Emp implements iTraveller{
	private double incentive;
	private double target;
	private int daysTravelled;
	

	

	public SalesManager() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SalesManager(String name, int dd, int mm, int yy, int salary, int emp_id, double incentive, double target,
			int daysTravelled) {
		super(name, dd, mm, yy, salary, emp_id);
		this.incentive = incentive;
		this.target = target;
		this.daysTravelled = daysTravelled;
	}







	@Override
	public void display() {
		
		super.display();
			System.out.println("target: "+target);
			System.out.println("incentive: "+incentive);
			System.out.println("daysTravelled"+daysTravelled);
			
			
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+"\n target="+target+" \n incentive="+incentive;
	}
	public double calSalary()
	{
		return salary+incentive;
	}
	public double calculateTA() {
		return daysTravelled*salary*(DA/100);
	}

	
}

