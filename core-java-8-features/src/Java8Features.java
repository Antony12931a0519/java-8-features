import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Java8Features {

	// printing all the elements from the list
	// filter the content
	// sort the elements

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		List<String> filteredList = new ArrayList<String>();
		List<String> sortedList = new ArrayList<String>();
		List<String> mappedList = new ArrayList<String>();
		List<String> filteredListUsinfPedicates = new ArrayList<String>();
		/*
		 * list.add("Antony"); list.add("Samapth"); list.add("Kumar");
		 * list.add("Reddy"); list.add("Hima"); list.add("Karthik");
		 * list.add("Kanchan");
		 */

		list = Arrays.asList("Antony", "Sampath", "Kumar", "Reddy", "Ranfy",
				"Kunfu", "Dav");
		

		// print ting the list
		/*for (String s : list) {
			System.out.println(s);
		}*/
		
		System.out.println("Used Lamda Expressions");
		list.stream().forEach(name -> System.out.println(name));
		
		
		List ref = list.stream().sorted().collect(Collectors.toList());
	  System.out.println(ref);
	  
	/*  List ref = list.stream().sorted(x -> x.).collect(Collectors.toList());
	  System.out.println(ref);*/
	  
	  

		// for filtering
		for (String s : list) {
			if (s.startsWith("K")) {
				filteredList.add(s);
			}
			/*
			if(s.contains("Kumar")){
				list.add("nkjnc")
			}*/

		}
		
		//maping the elements
		mappedList = list.stream().map(s -> s.concat("#")).collect(Collectors.toList());
		
		//filtering the elements
		filteredListUsinfPedicates = list.stream().filter(s -> s.length()<=5).collect(Collectors.toList());
		
		System.out.println("filteredListUsinfPedicates List:"+filteredListUsinfPedicates);
		
		System.out.println("mapped List:"+mappedList);

		System.out.println("Actual List:" + list);
		System.out.println("Filtered List:" + filteredList);

		// for sorting
		Collections.sort(list);

		System.out.println("Ascending Sorted List:" + list);

		// for sorting
		Collections.reverse(list);
		System.out.println("Descending Sorted List:" + list);

	}

}
