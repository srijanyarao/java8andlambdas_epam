package task;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Palindrome {
    public static void main(String args[]) {
		List<String> strList = Arrays.asList("madam", "mom", "eye", "pup", "rise", "", "noon", "wow", "sri");
							

			    List <String> palindromeStrings = Palindrome.filterList(strList,StrPredicates::isPalindrome);
				System.out.println("The string of Palindrome is :\n "+palindromeStrings);

			}
			
			
			  public static List<String> filterList(List<String> list, Predicate<String> predicate) {
				List<String> finalList = new ArrayList<String>();

				for (String str : list) {
				  if (predicate.test(str) ){
				  finalList.add(str);
				  }
				}
				return finalList;

		}

		
		 
		
	}
