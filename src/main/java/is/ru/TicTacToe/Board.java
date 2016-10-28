package is.ru.TicTacToe;


import java.io.PrintWriter;

public class Board {

	private int ROW_SIZE = 3;
	private int COLUMN_SIZE = 3;
	public char board[][] = new char[ROW_SIZE][COLUMN_SIZE];

	public Board() {

		for (int i = 0; i < ROW_SIZE; i++) {
			for (int j = 0; j < COLUMN_SIZE; j++) {
				board[i][j] = ' ';
			}
		}	
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
		
		if (r >= 0 && c >= 0 && r < 3 && c < 3 && board[r][c] == ' ') {
			return true;
		}
		return false;
	}
	
	public boolean pickField(int r, int c, char Symbol){
		if(checkIfMoveIsLegal(r,c)){
			board[r][c] = Symbol;
			return true;
		}
		else{
			System.out.println("Move not legal");
			return false;
		}
	}

	public boolean gameIsWon() {

		//diagonal left to right
		if (board[0][0] == 'X' && board[1][1] == 'X' && board[2][2] == 'X') {
			System.out.println("X won the game!");
			return true;
		}
		if (board[0][0] == 'O' && board[1][1] == 'O' && board[2][2] == 'O') {
			System.out.println("O won the game!");
			return true;
		}
		//diagonal right to left
		if (board[0][2] == 'X' && board[1][1] == 'X' && board[2][0] == 'X') {
			System.out.println("X won the game!");
			return true;
		}
		if (board[0][2] == 'O' && board[1][1] == 'O' && board[2][0] == 'O') {
			System.out.println("O won the game!");
			return true;
		}

		//horizontal top line.
		if (board[0][0] == 'X' && board[0][1] == 'X' && board[0][2] == 'X') {
			System.out.println("X won the game!");
			return true;
		}
		if (board[0][0] == 'O' && board[0][1] == 'O' && board[0][2] == 'O') {
			System.out.println("O won the game!");
			return true;
		}
		//horizontal middle line
		if (board[1][0] == 'X' && board[1][1] == 'X' && board[1][2] == 'X') {
			System.out.println("X won the game!");
			return true;
		}
		if (board[1][0] == 'O' && board[1][1] == 'O' && board[1][2] == 'O') {
			System.out.println("O won the game!");
			return true;
		}
		//horizontal bottom line
		if (board[2][0] == 'X' && board[2][1] == 'X' && board[2][2] == 'X') {
			System.out.println("X won the game!");
			return true;
		}
		if (board[2][0] == 'O' && board[2][1] == 'O' && board[2][2] == 'O') {
			System.out.println("O won the game!");
			return true;
		}

		//vertical left line
		if (board[0][0] == 'X' && board[1][0] == 'X' && board[2][0] == 'X') {
			System.out.println("X won the game!");
			return true;
		}
		if (board[0][0] == 'O' && board[1][0] == 'O' && board[2][0] == 'O') {
			System.out.println("O won the game!");
			return true;
		}
		//vertical middle line
		if (board[0][1] == 'X' && board[1][1] == 'X' && board[2][1] == 'X') {
			System.out.println("X won the game!");
			return true;
		}
		if (board[0][1] == 'O' && board[1][1] == 'O' && board[2][1] == 'O') {
			System.out.println("O won the game!");
			return true;
		}
		//vertical left line
		if (board[0][2] == 'X' && board[1][2] == 'X' && board[2][2] == 'X') {
			System.out.println("X won the game!");
			return true;
		}
		if (board[0][2] == 'O' && board[1][2] == 'O' && board[2][2] == 'O') {
			System.out.println("O won the game!");
			return true;
		}

		return false;
	}

	public boolean boardIsFull() {

		for (int i = 0; i < ROW_SIZE; i ++) {
			for (int j = 0; j < COLUMN_SIZE; j++) {

				if (board[i][j] == ' ') {
					return false;
				}
			}
		}
		return true;
	}

	public boolean gameIsDrawn() {

		if (boardIsFull() && !gameIsWon()) {
			System.out.println("It's a tie!");
			return true;
		}

		return false;
	}

	public void displayBoard() {

		for (int i = 0; i < ROW_SIZE; i++) {
				for (int j = 0; j < COLUMN_SIZE; j++) {
					
					System.out.print(board[i][j] + " | ");
				}
				System.out.println("\n-----------");
			}
			System.out.println();
	}
	
}
