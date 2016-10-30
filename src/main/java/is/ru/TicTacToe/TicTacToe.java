package is.ru.TicTacToe;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Scanner;

public class TicTacToe{
	private Board gameBoard;
	private char symbol;
	private int playerNr;
	private boolean player1Turn;

	public static void main(String[] args) throws IOException{
		TicTacToe t = new TicTacToe();
		t.playGame();
	}

	public TicTacToe(){
		gameBoard = new Board();
		symbol = 'X';
		playerNr = 1;
		player1Turn = true;
	}

	public void playGame(){
		System.out.println("Welcome to the TicTacToe game of the century!");
		while(!(gameBoard.gameIsWon('X') || gameBoard.gameIsWon('O')) && !(gameBoard.gameIsDrawn())){
			takeTurn();
		}
		System.out.println();
                gameBoard.displayBoard();
	}

	public void takeTurn(){
			Scanner input = new Scanner(System.in);
                        gameBoard.displayBoard();
                        boolean legalMove = false;
			int move = 0;

                        while (legalMove == false) {
                                System.out.println("Player " + playerNr + " move, choose a field to put an " + symbol + ": ");

                                try{
                                        move =  input.nextInt();
					legalMove = insertSymbol(move);
                                }catch(java.util.InputMismatchException e){
                                        System.out.println("Input has to be a number");
                                        input.nextLine();
                                }

                        }

                        symbol = player1Turn ? 'O' : 'X';
                        playerNr = playerNr == 1 ? 2 : 1;
                        player1Turn = !player1Turn;
	}

	public boolean insertSymbol(int move){
		return gameBoard.pickField(getRow(move), getCol(move), symbol);
	}

	public static int getRow(int i){
  		int toRow = ((i - 1)/3) % 3;
    		return toRow;
  	}

	public static int getCol(int i){
  		int toCol = (i - 1) % 3;
    		return toCol;
  	}
}
