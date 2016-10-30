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

	//Return true if no field has been picked else return false.
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

	//Return true if the move is  legal, that is if the player picks a empty field inside the board, else return false.
	public boolean checkIfMoveIsLegal(int r, int c) {
		
		if (r >= 0 && c >= 0 && r < 3 && c < 3 && board[r][c] == ' ') {
			return true;
		}
		return false;
	}
	
	//If the player picks emtpy field puts X or O on the field and return true, else return false.
	public boolean pickField(int r, int c, char Symbol){
		if(checkIfMoveIsLegal(r,c)){
			board[r][c] = Symbol;
			return true;
		}
		else{
			System.out.println("Illegal move, please try again.");
			return false;
		}
	}

	//Return true if the game is won, else return false.
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

	//Returns true if no field on the board is empty.
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
			System.out.println("It's a tie!");
			return true;
		}

		return false;
	}

	//Returns true if the game is tie (the board is full and the game is not won), else return false.
	public void displayBoard() {
		System.out.println(" " + getSymbolForDisplay(1, board[0][0]) + " | " + getSymbolForDisplay(2, board[0][1]) + " | " + getSymbolForDisplay(3, board[0][2]));
		System.out.println("------------------");
		System.out.println(" " + getSymbolForDisplay(4, board[1][0]) + " | " + getSymbolForDisplay(5, board[1][1]) + " | " + getSymbolForDisplay(6, board[1][2]));
		System.out.println("------------------");
		System.out.println(" " + getSymbolForDisplay(7, board[2][0]) + " | " + getSymbolForDisplay(8, board[2][1]) + " | " + getSymbolForDisplay(9, board[2][2]));

	}

	//Takes in the symbol if the box is already marked with X or O and returns either the symbol or the number of the square with brackets around the number. 
	public String getSymbolForDisplay(int counter, char symbol){
		if(symbol == ' '){
			return "("+counter+")";
		}
		else{
			return " "+symbol+" ";
		}
	}
}
