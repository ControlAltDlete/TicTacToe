package is.ru.TicTacToe;

import static org.junit.Assert.*;
import org.junit.Test;

public class PlayerTest{
	Player classToTest = new Player();
	Player classToTest2 = new Player("Player 1");

	@ Test
	public void testIfClassIsCreated(){	
		assertNotNull("Class was not created", classToTest);
		assertNotNull("Class was not created", classToTest2);
	}
}