package is.ru.TicTacToe;

import static org.junit.Assert.*;
import org.junit.Test;

public class BoardTest {
	@Test 
	public void testNewBoard() {
		
		//int board[][] = new int [3][3];

		Board b = new Board();

		assertEquals(true, b.isEmpty());

	}
}