package is.ru.TicTacToe;

import org.junit.Test;
import static org.junit.Assert.*;

public class TicTacToeTest{

	Board newBoard = new Board();
	Player player1 = new Player("Player 1");
	Player player2 = new Player("Player 2");

	@Test
	public void testIfClassesAreCreated(){
		assertNotNull("Class not created", newBoard);
		assertNotNull("Class not created", player1);
		assertNotNull("Class not created", player2);
	}

	@Test
	public void testIf(){

	}
}

