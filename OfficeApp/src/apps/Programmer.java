package apps;

public class Programmer extends Emp implements iTraveller {
	private int extrahours;
	private int chargesperhour;
	private int daysTravelled;

	public Programmer() {
		super();
	}
	
	public Programmer(String name, int dd, int mm, int yy, int salary, int emp_id, int extrahours, int chargesperhour,
			int daysTravelled) {
		super(name, dd, mm, yy, salary, emp_id);
		this.extrahours = extrahours;
		this.chargesperhour = chargesperhour;
		this.daysTravelled = daysTravelled;
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		super.display();
		System.out.println("extrahours:"+extrahours);
		System.out.println("chargesperhour:"+chargesperhour);
		System.out.println("days Travelled:"+daysTravelled);
		System.out.println("Travel Allowance"+calculateTA());
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+"extrahours:"+extrahours+"chargesperhour:"+chargesperhour;
	}
	
	public double calSalary()
	{
		return salary+(chargesperhour+extrahours);
	}
	public double calculateTA() 
	{
		return daysTravelled*salary*(DA/100);
		
		
	}

	
	
}

