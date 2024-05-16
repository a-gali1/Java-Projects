import java.util.Scanner;

public class Number_Pyramid {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		int count = -1;
		
		System.out.println("*** Pyramid ***");
		
		System.out.println("Enter the size: ");
		
		int size = scan.nextInt();
		
		for(int i = 0; i < size*2; i++) 
		{
			if(i % 2 != 0) 
			{
				count = i;
			}
			else
				count = 0;
			for(int k = size*2; k > count; k--) 
			{
				System.out.print(" ");
			}
			for(int j = 0; j < count; j++) 
			{
				System.out.print((int)Math.pow(2, j) + " ");
			}
			System.out.println();
	}

}
}