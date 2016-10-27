package is.ru.TicTacToe;


public class Board
{
	private int ROW_SIZE = 3;
	private int COLUMN_SIZE = 3;
	public char board[][] = new char[ROW_SIZE][COLUMN_SIZE];

	public enum StateOfGame {
		StillPlaying, Draw, Xwon, Ywon;
	}

	public Board() {

		for (int i = 0; i < ROW_SIZE; i++) {
			for (int j = 0; j < COLUMN_SIZE; j++) {
				board[i][j] = ' ';
			}
		}

		//StateOfGAme = StillPlaying;
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
	}

	/*public void boardDisplay(board[][]) {

		for (int i = 0; i < ROW_SIZE; i++) {
			for (int j = 0; j < COLUMN_SIZE; j++) {
					
				StdOut.printf(board[i][j] + " | ");
			}
			StdOut.printf("\n");
			StdOut.println("-----------");
				
		}*/
	}
