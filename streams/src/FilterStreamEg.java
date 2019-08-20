
// Java code for Stream filter 
// (Predicate predicate) to get a stream 
// consisting of the elements of this 
// stream that match the given predicate. 
import java.util.*; 

public class FilterStreamEg { 

	// Driver code 
	public static void main(String[] args) 
	{ 

		// Creating a list of Integers 
		List<Integer> list = Arrays.asList(3, 4, 15, 6, 12, 20); 

		// Using Stream filter(Predicate predicate) 
		// to get a stream consisting of the 
		// elements that are divisible by 5 
		list.stream().filter((num) -> num % 5 == 0).forEach(System.out::println); 
	} 
} 
