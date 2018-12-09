package apps;

public abstract class Admin extends Emp {
private int allowance;

public Admin() {
	super();
	// TODO Auto-generated constructor stub
}

public Admin(String name, int dd, int mm, int yy, int salary, int emp_id,int allowance) {
	super(name, dd, mm, yy, salary, emp_id);
	this.allowance=allowance;
}

@Override
public void display() {
	// TODO Auto-generated method stub
	super.display();
	System.out.println("allowances");
}

@Override
public String toString() {
	// TODO Auto-generated method stub
	return super.toString()+"\nallowances"+allowance;
}
public double calSalary()
{
	return salary+allowance;
}


}