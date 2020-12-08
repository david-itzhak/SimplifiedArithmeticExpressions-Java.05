package telran.numbers.tests;

import static org.junit.jupiter.api.Assertions.*;
import static telran.numbers.ArithmeticExpessions.*;

import org.junit.jupiter.api.Test;

class ArithmeticExpessionsTest {

	@Test
	void testIsValid() {
		assertTrue(isValid("25"));
		assertTrue(isValid(" 25 +3 /  2"));
		assertTrue(isValid( "25 + 3/  2* 5-   2"));
		assertTrue(isValid( "25 + 3/  2* 5-   2 "));
		assertTrue(isValid( "25 + 3/  2* 5-   2    "));
		
		assertFalse(isValid(" 25 +"));
		assertFalse(isValid(" 25 ++3"));
		assertFalse(isValid(" 25 # 10"));
	}

	@Test
	void testCompute() {
		assertEquals(25, compute("25  "));
		assertEquals(10, compute("10 * 2 / 2 + 5 - 5 "));
		assertEquals(68, compute(" 25 + 3/  2* 5-   2"));
		
	}

}
