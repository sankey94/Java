package apps;

public class Datedemo
{
	public static void main(String args[])
	{
		Person p1=new Person();
		p1.display();
		Person.showCount();
		Person p2=new Person("Shalini",5,10,1994);
		p2.display();
		Person.showCount();
		Person p3=new Person(p2);
		p3.display();
		Person.showCount();
		System.out.println("***************************************");
		/*Person  p4=new Emp("Shalini",12,33,1231,31000,4545);
		p4.display();
		System.out.println("***************************************");
		System.out.println(p4);
	*/	
	}
	
}	