import java.util.*;

public class Unit03_IndividualProject {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a numerator: ");
		
		int num = scan.nextInt();
		
		System.out.println("Enter a denominator: ");
		
		int denom = scan.nextInt();
		
		if(num < denom) 
		{
			System.out.println(num + " / " + denom + " is a proper fraction");
		}
		else
		{
			if (num % denom == 0) 
			{
				System.out.println(num + " / " + denom + " is an improper fraction" + " but it can be reduced to " + (num/denom));
			}
			else
			{
				System.out.println(num + " / " + denom + " is an improper fraction" + " and its mixed fraction is " + (num/denom) + " + " + (num % denom) + " / " + denom);
			}
		}
	}

}
