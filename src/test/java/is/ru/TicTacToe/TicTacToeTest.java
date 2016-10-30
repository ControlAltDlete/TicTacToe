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
		int[] moveToTest = game.changeInput(1);
		int[] moveToTest2 = game.changeInput(9);

		int[] expectedResult = new int[]{0, 1};
		int[] expectedResult2 = new int[]{2, 2};

		assertEquals(moveToTest[0], 0);
		assertEquals(moveToTest[1], 0);
		assertEquals(moveToTest2[0], 2);
		assertEquals(moveToTest2[1], 2);
	}
}

