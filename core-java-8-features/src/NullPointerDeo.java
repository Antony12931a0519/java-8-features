import java.util.Calendar;
import java.util.Date;

public class NullPointerDeo {

	public static void main(String[] args) {
		Student student = new Student();
		System.out.println(student.getName());
		
		Date date  = new Date();
		
		Calendar calendar = Calendar.getInstance();
		
		
		System.out.println(date);
		

		System.out.println(date.getDay());
		
		System.out.println(calendar.getCalendarType());
//		System.out.println(calendar.);

	}

}
