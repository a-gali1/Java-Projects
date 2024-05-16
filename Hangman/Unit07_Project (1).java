import java.util.*;

public class Unit07_Project {

	public static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		boolean play = true;
		
		while(play) 
		{
			play = false;
			playHangman(getWord());
			System.out.print("Do you want to play again? y/n: ");
			String pa = scan.next();
			if(pa.toLowerCase().equals("y")) play = true;
			else if(pa.toLowerCase().equals("n")) System.out.println("Thank you for playing Hangman!\nGoodbye");
		}
		
	}
	
	
	public static String getWord() 
	{
		String[] words = {"loafer", "computer", "project", "calculator", "mound"};	
		
		return words[(int)(Math.random() * words.length)];
	}
	
	public static void playHangman(String s) 
	{
		String[] uk = new String[s.length()];
		
		boolean nl = false;
		
		int count = 0;
		
		for(int i = 0; i < s.length(); i++) uk[i] = "*";
		
		System.out.println("Play Hangman!");
		System.out.println();
		
		while(count < 8) 
		{
			nl = false;
			
			Print(uk);
						
			Hangman(count);
			
			if(Solved(uk)) 
			{
				System.out.println();
				System.out.println("The word is " + s + " - You missed " + count + " times.");
				System.out.println("You got it!");
				break;
			}
			else if(!Solved(uk) && count == 7) 
			{ 
				System.out.println();
				System.out.println("The word is " + s + " - You missed " + count + " times.");
				System.out.println("You used up all chances.");
				break;
			}
			
			System.out.println();
			
			System.out.println("Enter a letter in the word: ");
			
			String letter = scan.next();	
			
			boolean repeat = true;
			
			for(int i = 0; i < s.length(); i++) 
			{
				if(s.charAt(i) == letter.charAt(0)) 
				{ 
					if(uk[i].equals(letter) && repeat) 
					{
						System.out.println("You have already guessed this word.");
						repeat = false;
					}
					else if(!uk[i].equals(letter)) uk[i] = letter;
					
					nl = true;
				}
			}
			
			if(!nl)
			{
				count++;
				System.out.println(letter + " is not in the word.");
				System.out.println("You missed " + count + " times.");
			}
			
		}
		}
	
	public static boolean Solved(String[] s) 
	{
		for(int i = 0; i < s.length; i++) 
		{
			if (s[i].equals("*")) return false;
		}
		return true;
	}
	
	public static void Print(String[] a) 
	{
		for(int i = 0; i < a.length; i++) 
		{
			System.out.print(a[i] + " ");
		}
	}

	public static void Hangman(int a) 
	{
		for(int c = 1; c < a+1; c++)
		{	
			if(c == 1) 
			{
				System.out.println();
				System.out.println("  |");
			}
				if(c == 2) System.out.println("  O");
			if(c == 3) System.out.print("--");
			if(c == 4) System.out.print("|");
			if(c == 5) System.out.print("--");
			if(c == 6) 
			{
				System.out.println();
				System.out.print(" /");
			}
			if(c == 7) 
			{ 
				System.out.print(" \\");
				System.out.println();
			}
		}
	}
}
