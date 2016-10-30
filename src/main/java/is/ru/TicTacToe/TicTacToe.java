package is.ru.TicTacToe;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Scanner;

public class TicTacToe{
	public static void main(String[] args) throws IOException{
		System.out.println("Welcome to the TicTacToe game of the century!");

		//Variables for the game defined.
		Scanner input = new Scanner(System.in);
		int move;
		int moveForBoard[];
		boolean player1Turn = true;

		TicTacToe game = new TicTacToe();
		Board gameBoard = new Board();
		Player player1 = new Player("Player 1");
		Player player2 = new Player("Player 2");

		//While loop that runs the game, it quits when somebody has won or there is a draw
		while(!(gameBoard.gameIsWon('X') || gameBoard.gameIsWon('O')) && !(gameBoard.gameIsDrawn())){
			//The board is displayed after each turn
			gameBoard.displayBoard();

			//Similar if-else statements, one for when it is Player 1's turn and the other one for when it's Player 2's turn.
			if(player1Turn){
				System.out.println("Player 2 move, choose a field to put an X: ");

				//Move from the user read
				move =  input.nextInt();
				input.nextLine();

				//Move chosen from the user translated for our two dimensional board.
				moveForBoard = game.changeInput(move);

				//The game will loop asking for a new input while the move chosen by the player is illegal, continues if the move is legal.
				boolean legalMove = gameBoard.pickField(moveForBoard[0], moveForBoard[1], 'X'); 

				while (!legalMove) {
					System.out.print("Try again: ");

					move =  input.nextInt();
					input.nextLine();

					moveForBoard = game.changeInput(move);

					legalMove = gameBoard.pickField(moveForBoard[0], moveForBoard[1], 'X');
				}

				//Boolean variable changed so the other player can make a move.
			 	player1Turn = false;

			}
			else{
				System.out.println("Player 1 move, choose a field to put an O: ");

				//Move from the user read
				move =  input.nextInt();
				input.nextLine();

				//Move chosen from the user translated for our two dimensional board.
				moveForBoard = game.changeInput(move);

				//The game will loop asking for a new input while the move chosen by the player is illegal, continues if the move is legal.
				boolean legalMove = gameBoard.pickField(moveForBoard[0], moveForBoard[1], 'O');

				while (!legalMove) {
					System.out.print("Try again: ");

					move =  input.nextInt();
					input.nextLine();

					moveForBoard = game.changeInput(move);

					legalMove = gameBoard.pickField(moveForBoard[0], moveForBoard[1], 'O');
				}

				//Boolean variable changed so the other player can make a move.
				player1Turn = true;

			}
		}

		//Board is displayed in it's end game state.
		System.out.println();
		gameBoard.displayBoard();
	}

	//Move by the user translated from a number 1 to 9 to indexes in our two dimensional array.
	public int[] changeInput(int move){
		int[] returnMove = new int[2];
		switch(move){
			case 1:
				returnMove[0] = 0;
				returnMove[1] = 0;
				break;
			case 2:
				returnMove[0] = 0;
				returnMove[1] = 1;
				break;
			case 3:
				returnMove[0] = 0;
				returnMove[1] = 2;
				break;
			case 4:
				returnMove[0] = 1;
				returnMove[1] = 0;
				break;
			case 5:
				returnMove[0] = 1;
				returnMove[1] = 1;
				break;
			case 6:
				returnMove[0] = 1;
				returnMove[1] = 2;
				break;
			case 7:
				returnMove[0] = 2;
				returnMove[1] = 0;
				break;
			case 8:
				returnMove[0] = 2;
				returnMove[1] = 1;
				break;
			case 9:
				returnMove[0] = 2;
				returnMove[1] = 2;
				break;
		}

		return returnMove;
	}
}
