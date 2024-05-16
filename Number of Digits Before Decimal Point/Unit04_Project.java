import java.util.*;

public class Unit04_Project {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter a floating point number: ");
		
		double input = scan.nextDouble();
		
		String ans = input + "";
		
		System.out.println("The number of digits before the decimal point in " + ans +" is " + ans.indexOf("."));
	}

}
