
public class StudentIO {
private int rollno;
public String name;
public float percent;

public StudentIO (int rollno, String name, float percent) {
	super();
	this.rollno = rollno;
	this.name = name;
	this.percent = percent;
}


@Override
public String toString() {
	return "Student [rollno=" + rollno + ", name=" + name + ", percent=" + percent + "]";
}


public String getName() {
	return name;
}


public float getPercent() {
	return percent;
}
}


