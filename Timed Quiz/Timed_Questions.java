import java.util.*;

public class Timed_Questions {

	public static void main(String[] args) 
	{
		final int Num_Of_Questions = 5;
		Scanner scan = new Scanner(System.in);
		
		int count = 0;
		int n1, n2, answer;
		int CorrectNum = 0;
		String history = "-------------------------" + "\n" + "End of Test. Test Record: " + "\n" + "\n";
		
		
		long startTime = System.currentTimeMillis();
		
		while(count < Num_Of_Questions) 
		{
			n1 = (int)(Math.random() * 10);
			n2 = (int)(Math.random() * 10);
			if (n1 < n2) 
			{
				int temp;
				temp = n1;
				n1 = n2;
				n2 = temp;
			}
			System.out.print("What is " + n1 + " - " + n2 + " = ?: ");
			answer = scan.nextInt();
			if(answer == n1 - n2) 
			{
				System.out.print("Correct" + "\n");
				CorrectNum++;
				history += "\n" + n1 + " - " + n2 + " = " + answer + ": Correct";
			}
			else 
			{
				System.out.print("Not Correct" + "\n");
				history += "\n" + n1 + " - " + n2 + " = " + answer + ": Not Correct";
			}
			count++;
		}
		long endTime = System.currentTimeMillis();
		System.out.println(history);
		System.out.println("\n" + "Number of correct answers: " + CorrectNum + " out of " + Num_Of_Questions);
		System.out.println("Total test time: " + ((endTime - startTime)/1000) + "seconds");
	}

}
