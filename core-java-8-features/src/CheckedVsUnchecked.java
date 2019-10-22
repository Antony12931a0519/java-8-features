import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Date;

public class CheckedVsUnchecked {

	public static void main(String[] args) throws FileNotFoundException,ArithmeticException {

		System.out.println("Hello World");
		System.out.println(new Date());
		Student student = null;
		// System.out.println(student.getName());
		System.out.println(1 / 0);

		/*
		 * unchecked ecxception Exception in thread "main"
		 * java.lang.NullPointerException at
		 * CheckedVsUnchecked.main(CheckedVsUnchecked.java:13)
		 */

		File file = new File("D:\\canada process\\najdja.txt");

		FileInputStream fis = new FileInputStream(file);

		System.out.println(file.getName());
	}

}
