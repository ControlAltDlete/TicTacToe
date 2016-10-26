package is.ru.TicTacToe;

import static org.junit.Assert.*;
import org.junit.Test;

public class BoardTest
{
		@Test 
		public void testBoardClass()
		{
			Board classToTest = new Board();
			assertNotNull(classToTest);
		}
}