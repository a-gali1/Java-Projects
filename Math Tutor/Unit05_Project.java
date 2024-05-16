import java.util.*;

public class Unit05_Project {

	public static void main(String[] args) 
	{
		
		Scanner scan = new Scanner(System.in);
		
		int choice = 0;
		
		int n1 = (int)(Math.random() * 10);
		int n2 = (int)(Math.random() * 10);
		
		System.out.print("Main Menu \n1: Addition \n2: Subtraction \n3: Multiplication \n4: Division \n5: Exit \nEnter a choice: ");
		
		do {			
			choice = scan.nextInt();
			if (choice > 5)System.out.println("Not a valid input. Try Again.");
		}
		while(choice > 5);
		
		switch(choice)
		{
			case 1: System.out.print("What is " + n1 + " + " + n2 + " = : "); break;
			case 2: 
				if(n1 < n2) 
				{
					int temp = n1;
					n1 = n2;
					n2 = temp;
				}
				System.out.print("What is " + n1 + " - " + n2 + " = : "); break;
			case 3: System.out.print("What is " + n1 + " X " + n2 + " = : "); break;
			case 4: 
				while(n2 == 0) 	n2 = (int)(Math.random() * 10);
				System.out.print("What is " + n1 + " / " + n2 + " = : "); break;
			case 5: System.out.println("Thank You for using Math Tutor. \nGood Bye");
		}
		
		int i = scan.nextInt();
		
		switch(choice)
		{
			case 1: 
				if(n1 + n2 == i) System.out.println("Correct");
				else System.out.println("Not Correct." + n1 + " + " + n2 + " = " +  (n1 + n2)); break;
			case 2: if(n1 - n2 == i) System.out.println("Correct");
			else System.out.println("Not Correct." + n1 + " - " + n2 + " = " +  (n1 - n2)); break;
			case 3: if(n1 * n2 == i) System.out.println("Correct");
			else System.out.println("Not Correct." + n1 + " X " + n2 + " = " +  (n1 * n2)); break;
			case 4: if(n1 / n2 == i) System.out.println("Correct");
			else System.out.println("Not Correct." + n1 + " / " + n2 + " = " +  (n1 / n2)); break;
			default: System.out.println("Not a valid input. Try Again."); break;
		}

	}

}
