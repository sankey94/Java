package collectionassignment;

import java.util.Comparator;

public class AnonymousInner {

	public static void main(String[] args) {
	
		Set<> st1=new TreeSet<>(new Comparator<Student>()
				{
			
					@Override
					public int compare(Student o1, Student arg1) {
						
						return 0;
					}
			
				}

	}

}
