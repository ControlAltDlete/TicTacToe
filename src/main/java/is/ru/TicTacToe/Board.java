package is.ru.TicTacToe;


import java.io.PrintWriter;

public class Board {

	private int ROW_SIZE = 3;
	private int COLUMN_SIZE = 3;
	public char board[][] = new char[ROW_SIZE][COLUMN_SIZE];

<<<<<<< HEAD
=======
	public enum StateOfGame {
		StillPlaying, Draw, Xwon, Ywon;
	}
>>>>>>> 90470cf11a8e49baadaeb52f2aded8f4305b4ab5

	public Board() {

		for (int i = 0; i < ROW_SIZE; i++) {
			for (int j = 0; j < COLUMN_SIZE; j++) {
				board[i][j] = ' ';
			}
		}	

<<<<<<< HEAD
=======
		//StateOfGAme = StillPlaying;
>>>>>>> 90470cf11a8e49baadaeb52f2aded8f4305b4ab5
	}

	public boolean isEmpty() {
		
		for (int i = 0; i < ROW_SIZE; i++) {
			for (int j = 0; j < COLUMN_SIZE; j++) {
				if (board[i][j] != ' ') {
					return false;
				}
			}	
		}

		return true;
	}

	public boolean checkIfMoveIsLegal(int r, int c) {
		
		if ((board[r][c]==' ' && r > 0 && c > 0 && r < 3 && c < 3)) {
			return true;
		}
		return false;
<<<<<<< HEAD
	}

	/*public void boardDisplay(char[][] board) {

		for (int i = 0; i < ROW_SIZE; i++) {
			for (int j = 0; j < COLUMN_SIZE; j++) {
					
				System.out.println("hello world");
			}
			//StdOut.printf("\n");
			//StdOut.println("-----------");
				
		}
	}

=======
	}

	public void boardDisplay(char[][] board) {

		for (int i = 0; i < ROW_SIZE; i++) {
			for (int j = 0; j < COLUMN_SIZE; j++) {
					
				System.out.println("hello world");
			}
			//StdOut.printf("\n");
			//StdOut.println("-----------");
				
		}
	}

>>>>>>> 90470cf11a8e49baadaeb52f2aded8f4305b4ab5
	public static void main (String[] args) {

		char [][] b = new char[3][3];

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				b[i][j] == 'a';
			}
		}

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.println("helloWorld");
			}
		}

<<<<<<< HEAD
	}*/
=======
	}
>>>>>>> 90470cf11a8e49baadaeb52f2aded8f4305b4ab5

}