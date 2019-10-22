import java.util.StringTokenizer;

import javax.management.ReflectionException;

public class ThreadExecutor {

	public static void main(String[] args) {

		Thread1 t1 = new Thread1();

		Thread2 t2 = new Thread2();

		Thread t = new Thread(t2);

	//	asynchronization
		//scheduler inside jvm
		
		//reflection api.
		
		  t1.start();
		  t.start();
		  System.out.println("Current thread:"+Thread.currentThread().getName());
		  System.out.println(Object.class);
		  System.out.println(ReflectionException.class);
//		  System.out.println("esdrfthgyjhujikol"+ThreadExecutor.class.);
		  StringTokenizer  ref = new StringTokenizer("tfyguhi rdtfytguhi redtrfytguy tdrfytgu", " ");
		  
		  String name = "redtfgyuhijokpl[;]yguhiujokp";
		  name.split(" ");
		  System.out.println(ref);		  
		  while(ref.hasMoreElements()){
			  System.out.println(ref.nextToken());
			  
			 
			  
			  
		  }
		 

	}

}
