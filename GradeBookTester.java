package cmsc_204_labs;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeBookTester
{

	GradeBook GB1, GB2;
	@BeforeEach
	void setUp() throws Exception
	{
		GB1 = new GradeBook(5);
		GB2 = new GradeBook(6);
		
		GB1.addScore(1);
		GB1.addScore(2);
		GB1.addScore(3);
		
		GB2.addScore(4);
		GB2.addScore(5);
		GB2.addScore(6);
		
	}

	@AfterEach
	void tearDown() throws Exception
	{
		GB1 = null;
		GB2 = null;
		
	}

	@Test
	void testAddScore()
	{
		System.out.print(GB1.toString());
		assertTrue(GB1.toString().equals("1.0 2.0 3.0 0.0 0.0 "));
		assertTrue(GB2.toString().equals("4.0 5.0 6.0 0.0 0.0 0.0 "));
		
		assertEquals(GB1.getScoreSize(), 3);
		assertEquals(GB2.getScoreSize(), 3);
	}

	@Test
	void testSum()
	{
		assertEquals(GB1.sum(), 6);
		assertEquals(GB2.sum(), 15);
	}

	@Test
	void testMinimum()
	{
		assertEquals(GB1.minimum(), 1);
		assertEquals(GB2.minimum(), 4);
	}

	@Test
	void testFinalScore()
	{
		assertEquals(GB1.finalScore(), 5);
		assertEquals(GB2.finalScore(), 11);
	}

//	@Test
//	void testGetScoreSize()
//	{
//		fail("Not yet implemented");
//	}

//	@Test
//	void testToString()
//	{
//		fail("Not yet implemented");
//	}

}
