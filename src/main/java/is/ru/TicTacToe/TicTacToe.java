package is.ru.TicTacToe;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Scanner;

public class TicTacToe{
	public static void main(String[] args) throws IOException{
		System.out.println("Welcome to the TicTacToe game of the century!");

		TicTacToe game = new TicTacToe();
		Board gameBoard = new Board();
		Player player1 = new Player("Player 1");
		Player player2 = new Player("Player 2");
		boolean player1Turn = true;
		int move;
		int moveForBoard[];
		Scanner input = new Scanner(System.in);

		while(!(gameBoard.gameIsWon('X') || gameBoard.gameIsWon('O')) && !(gameBoard.gameIsDrawn())){
			gameBoard.displayBoard();

			if(player1Turn){
				System.out.println("Player 2 move, choose a field to put an X: ");

				move =  input.nextInt();
				input.nextLine();

				moveForBoard = game.changeInput(move);

				boolean legalMove = gameBoard.pickField(moveForBoard[0], moveForBoard[1], 'X'); 

				while (!legalMove) {
					System.out.print("Try again: ");

					move =  input.nextInt();
					input.nextLine();

					moveForBoard = game.changeInput(move);

					legalMove = gameBoard.pickField(moveForBoard[0], moveForBoard[1], 'X');
				}


			 	player1Turn = false;

			}
			else{
				System.out.println("Player 1 move, choose a field to put an O: ");

				move =  input.nextInt();
				input.nextLine();

				moveForBoard = game.changeInput(move);

				boolean legalMove = gameBoard.pickField(moveForBoard[0], moveForBoard[1], 'O');

				while (!legalMove) {
					System.out.print("Try again: ");

					move =  input.nextInt();
					input.nextLine();

					moveForBoard = game.changeInput(move);

					legalMove = gameBoard.pickField(moveForBoard[0], moveForBoard[1], 'O');
				}

				player1Turn = true;

			}
		}
		System.out.println();
		gameBoard.displayBoard();
	}

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
