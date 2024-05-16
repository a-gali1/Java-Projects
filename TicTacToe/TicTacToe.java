import java.util.*;

public class TicTacToe {

	public static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		String[][] board = new String[3][3];
		for(int i = 0; i < board.length; i++) {
			for(int j =0; j < board.length; j++) {
				board[i][j] = " ";
			}
		}
		System.out.println("Play Tic Tac Toe!");
		displayBoard(board);
		
		do {
		    makeMove(board, "X");
		    
		    if (win(board, "X")) {
		        System.out.println("Player X wins!");
		        break; 
		    }
		    
		    if (draw(board)) break;
		    
		    makeMove(board, "O");
		    
		    if (win(board, "O")) {
		        System.out.println("Player O wins!");
		        break; 
		    }
		}
		while (!draw(board));
		
		if (draw(board)) System.out.println("Draw");

	}

	public static void displayBoard(String[][] b) {
		for(int j = 0; j < b.length; j++) {
			System.out.println("---------------");
			for(int i = 0; i < b.length; i++) {
				System.out.print(" | " + b[j][i]);
				
			}
			System.out.print(" |");
			System.out.println();
		}
		System.out.println("---------------");
	}
	
	public static void makeMove(String[][] b, String p) {
		System.out.println("Player " + p + " - Enter Row: ");
		int i = scan.nextInt();
		System.out.println("Column: ");
		int j = scan.nextInt();
		b[i][j] = p;
		displayBoard(b);
	}
	
	public static boolean win(String[][] b, String p) {
	    for (int i = 0; i < b.length; i++) {
	        int count = 0;
	        for (int j = 0; j < b[i].length; j++) {
	            if (b[i][j].equals(p)) {
	                count++;
	            }
	        }
	        if (count == 3) {
	            return true;
	        }
	    }

	    for (int j = 0; j < b[0].length; j++) {
	        int count = 0;
	        for (int i = 0; i < b.length; i++) {
	            if (b[i][j].equals(p)) {
	                count++;
	            }
	        }
	        if (count == 3) {
	            return true;
	        }
	    }

	    int count = 0;
	    for (int i = 0; i < b.length; i++) {
	        if (b[i][i].equals(p)) {
	            count++;
	        }
	    }
	    if (count == 3) {
	        return true;
	    }

	    count = 0;
	    for (int i = 0; i < b.length; i++) {
	        if (b[i][b.length - 1 - i].equals(p)) {
	            count++;
	        }
	    }
	    return count == 3;
	}
	
	public static boolean draw(String[][] b) {
	    for (int i = 0; i < b.length; i++) {
	        for (int j = 0; j < b[i].length; j++) {
	            if (b[i][j].equals(" ")) {
	                return false;
	            }
	        }
	    }
	    return true;
	}

	
}
