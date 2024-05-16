import java.util.*;

public class Factorial {

	public static void main(String[] args) {

		int num = 4;
		System.out.println(num + "! = " + factorial(num));
		
	}

	public static long factorial(int n) {
		if(n == 0) return 1;
		else return n * factorial(n - 1);
		
	}
	
}
