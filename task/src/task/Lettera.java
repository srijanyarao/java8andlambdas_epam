package task;
import java.util.Arrays;
import java.util.List;
import java.util.function.*;

public class Lettera {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("anu","apple","angry","doll","cat","ant","app","ace","axe");
		Predicate<String> startsWitha = (n) -> n.startsWith("a");
		Predicate<String> threeLetterLong = (n) -> n.length() == 3; 
		names.stream() 
		     .filter(startsWitha.and(threeLetterLong)) .forEach((n) -> System.out.print("\nName, which starts with 'a' and three letter long is : " + n));

		
	}

}
