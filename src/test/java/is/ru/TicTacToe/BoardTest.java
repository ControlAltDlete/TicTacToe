package is.ru.TicTacToe;

import static org.junit.Assert.*;
import org.junit.Test;

public class BoardTest {

	@Test 
	public void testNewBoard() {

		Board b = new Board();

		assertEquals(true, b.isEmpty());

	}

	@Test
	public void testIfLegalMove() {
		Board b = new Board();

		assertEquals(false, b.checkIfMoveIsLegal(3,4));
	}

	@Test 
	public void testInsertOne() {
		Board b = new Board();
		b.pickField(0 ,0 ,'X');
		
		assertEquals('X', b.board[0][0]);
	}
	
	@Test 
	public void testInsertSamePlace() {
		Board b = new Board();
		
		assertEquals(true, b.pickField(0, 0, 'X'));
		assertEquals('X', b.board[0][0]);
		assertEquals(false, b.pickField(0, 0, 'O'));
		assertEquals('X', b.board[0][0]);
	}
}
