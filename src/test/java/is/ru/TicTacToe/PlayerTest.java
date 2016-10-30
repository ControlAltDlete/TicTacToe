package is.ru.TicTacToe;

import static org.junit.Assert.*;
import org.junit.Test;

public class PlayerTest{
	Player classToTest = new Player();
	Player classToTest2 = new Player("Player X");

	@ Test
	public void testIfClassIsCreated(){	
		assertNotNull("Class was not created", classToTest);
		assertNotNull("Class was not created", classToTest2);
	}

	@ Test
	public void testIfNameIsSet(){
		assertEquals("", classToTest.getName());
		assertEquals("Player X", classToTest2.getName());
	}
}