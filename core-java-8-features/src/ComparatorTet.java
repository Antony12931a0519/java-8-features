import java.util.Collections;
import java.util.Comparator;

public class ComparatorTet implements Comparator<Student> {

	/*
	 * @Override public int compare(Student o1, Student o2) { // TODO
	 * Auto-generated method stub return o1.getName().compareTo(o2.getName()); }
	 */

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub

		if (o1.getId() > o2.getId())
			return 1;
		else
			return -1;

	}

	public static void main(String[] args) {
		
		
		

	}

}
