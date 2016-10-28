package is.ru.TicTacToe;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Scanner;

public class TicTacToe{
	public static void main(String[] args) throws IOException{
		System.out.println("Welcome to the TicTacToe game of the century!");
		
		Board gameBoard = new Board();
		Player player1 = new Player("Player 1");
		Player player2 = new Player("Player 2");
		boolean player1Turn = true;
		int firstNr;
		int secondNr;
		Scanner input = new Scanner(System.in);

		while(!(gameBoard.gameIsWon('X') || gameBoard.gameIsWon('O')) && !(gameBoard.gameIsDrawn())){
			gameBoard.displayBoard();

			if(player1Turn){
				System.out.println("Player 2 move, choose a field to put an X: ");
				
				firstNr =  input.nextInt();
				input.nextLine();
				secondNr =  input.nextInt();
				input.nextLine();

				System.out.println();
				System.out.println(firstNr + ", " + secondNr);
				
				boolean legalMove = gameBoard.pickField(firstNr, secondNr, 'X'); 
				
				while (!legalMove) {
					System.out.print("Try again: ");
				
					firstNr =  input.nextInt();
					input.nextLine();
					secondNr =  input.nextInt();
					input.nextLine();

					System.out.println();
					System.out.println(firstNr + ", " + secondNr);

					legalMove = gameBoard.pickField(firstNr, secondNr, 'X');
				}


			 	player1Turn = false;
				
			}	
			else{
				System.out.println("Player 1 move, choose a field to put an O: ");

				firstNr =  input.nextInt();
				input.nextLine();
				secondNr =  input.nextInt();
				input.nextLine();

				System.out.println();
				System.out.println(firstNr + ", " + secondNr);

				boolean legalMove = gameBoard.pickField(firstNr, secondNr, 'O');

				while (!legalMove) {
					System.out.print("Try again: ");
				
					firstNr =  input.nextInt();
					input.nextLine();
					secondNr =  input.nextInt();
					input.nextLine();

					System.out.println();
					System.out.println(firstNr + ", " + secondNr);

					legalMove = gameBoard.pickField(firstNr, secondNr, 'O');
				}

				player1Turn = true;
				
			}
		}
		System.out.println();
		gameBoard.displayBoard();
	}
}
