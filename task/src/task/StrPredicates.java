package task;

public class StrPredicates {
	public static boolean  isPalindrome(String str)
	{
		
		    if (str=="")
		    {
		       return false;
		    }
		
		  else 
		  {
			  String reverse = new StringBuilder(str).reverse().toString();
			  return str.equals(reverse);
		  }
		
		
	}

}
