import java.util.*;

public class Unit06_Project {

	public static void main(String[] args) {
		
		  System.out.println("Play Craps!");
		
		  int dice = GetDice();
		  
		  if(dice == 7 || dice == 11) 
		  {
			  System.out.println("Natural. You Win.");
			  System.exit(0);
		  }
		  else if(dice == 2 || dice == 3 || dice == 12) 
		  {
			  System.out.println("Craps! You Lose");
			  System.exit(0);
		  }
		  else 
		  {
			  int point = dice;
			  System.out.println("Point = " + point);
			  do 
			  {
				dice = GetDice();  
			  }
			  while(dice != point && dice != 7);
			  if(dice == point) 
			  {
				  System.out.println("Check sum is point. You Win");
				  System.exit(0);
			  }
			  else if(dice == 7) 
			  {
				  System.out.println("Check sum is 7. You Lose");
				  System.exit(0);
			  }
		  }

	}

	public static int GetDice() 
	{
	
		int d1 = (int)(Math.random()*6) + 1;
		int d2 = (int)(Math.random()*6) + 1;
		
		System.out.println("You rolled " + d1 + " + " + d2 + " = " + (d1 + d2));
		
		return (d1 + d2);
	}
	
}
