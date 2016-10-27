package is.ru.TicTacToe;

import static org.junit.Assert.*;
import org.junit.Test;

public class BoardTest {

	@Test 
	public void testNewBoard() {

		Board b = new Board();

		assertEquals(true, b.isEmpty());

	}

	@Test (expected = ArrayIndexOutOfBoundsException.class)
	public void testIfLegalMove() {
		Board b = new Board();

		assertEquals(false, b.checkIfMoveIsLegal(3,4));
	}
}
