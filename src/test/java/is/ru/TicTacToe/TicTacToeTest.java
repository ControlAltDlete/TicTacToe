package is.ru.TicTacToe;

import org.junit.Test;
import static org.junit.Assert.*;

public class TicTacToeTest{

	Board newBoard = new Board();
	Player player1 = new Player("Player 1");
	Player player2 = new Player("Player 2");
	TicTacToe game = new TicTacToe();

	@Test
	public void testIfClassesAreCreated(){
		assertNotNull("Class not created", newBoard);
		assertNotNull("Class not created", player1);
		assertNotNull("Class not created", player2);
	}

	@Test
	public void testIfInputIsChanged(){
		int row1 = game.getRow(1);
		int col1 = game.getCol(1);
		int row9 = game.getRow(9);
                int col9 = game.getCol(9);

		assertEquals(row1, 0);
		assertEquals(col1, 0);
		assertEquals(row9, 2);
		assertEquals(col9, 2);
	}
}

