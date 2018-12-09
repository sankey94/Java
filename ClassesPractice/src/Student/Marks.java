package Student;

public class Marks extends Student 
{
	private String subject;
	private int marks;
	
	
	public Marks(int id, String name, int age, String subject, int marks) {
		super(id, name, age);
		this.subject = subject;
		this.marks = marks;
	}


	@Override
	public String toString() {
		return "Marks [subject=" + subject + ", marks=" + marks + ", toString()=" + super.toString() + "]";
	}

	
	

}
