package task;
import java.util.Arrays;
import java.util.List;

public class Average {

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(1,3,5,6,7,8,9);
		numbers.stream() 
	           .mapToInt(i -> i) 
	           .average() 
	           .ifPresent(avg -> System.out.println("Average found is " + avg));

	}

}
