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

	public boolean gameIsWon(char symbol) {
		if(board[0][0] == symbol && board[0][1] == symbol && board[0][2] == symbol ||
				board[1][0] == symbol && board[1][1] == symbol && board[1][2] == symbol ||
				board[2][0] == symbol && board[2][1] == symbol && board[2][2] == symbol ||
				board[0][0] == symbol && board[1][0] == symbol && board[2][0] == symbol ||
				board[0][1] == symbol && board[1][1] == symbol && board[2][1] == symbol ||
				board[0][2] == symbol && board[1][2] == symbol && board[2][2] == symbol ||
				board[0][0] == symbol && board[1][1] == symbol && board[2][2] == symbol ||
				board[2][0] == symbol && board[1][1] == symbol && board[0][2] == symbol){
			System.out.println(symbol + " won the game!");
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

		if (boardIsFull() && !(gameIsWon('X') || gameIsWon('O'))) {
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
