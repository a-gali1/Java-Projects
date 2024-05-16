import java.util.*;

public class Palindrome_Checker {
	
	public static void main(String args[]) 
	{
	
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter Palindrome: ");
		
		String s1 = scan.nextLine();
		
		int low = 0;
		int high = s1.length() - 1;
		
		boolean Palindrome = true;
		
		char[] c1 = s1.toCharArray();
		
		while(low < high)
		{
			if(c1[low] != c1[high])
				Palindrome = false;
			low++;
			high--;
		}
		
		if (Palindrome) 
		{
			System.out.println(s1 + " is a Palindrome");
		}
		else System.out.println(s1 + " is not a Palindrome");
		
	}
	
}
