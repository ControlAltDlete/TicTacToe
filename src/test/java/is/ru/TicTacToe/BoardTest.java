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

	@Test 
	public void testIfGameIsWon() {

		Board b = new Board();

	    b.pickField(0, 0, 'X');
	    b.pickField(0, 1, 'O');
	    b.pickField(1, 1, 'X');
	    b.pickField(2, 1, 'O');
	    b.pickField(2, 2, 'X');
	    assertEquals(true, b.gameIsWon());


	}

	@Test 
	public void testIfGameIsDrawn() {
		
		Board b = new Board();
	    
	    b.pickField(0, 0, 'X');
	    b.pickField(0, 1, 'O');
	    b.pickField(0, 2, 'X');
	    b.pickField(1, 0, 'O');
	    b.pickField(1, 1, 'O');
	    b.pickField(1, 2, 'X');
	    b.pickField(2, 0, 'X');
	    b.pickField(2, 1, 'X');
	    b.pickField(2, 2, 'O');
	    assertEquals(false, b.gameIsDrawn());

	}
}
