import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StringCalcTest {

	StringCalc s=new StringCalc();
	@Test
	void emptyStringRetrunsZero() {
		assertEquals(s.calc(""),0);
	}
	@Test
	void singleReturn() {
		assertEquals(s.calc("1"),1);
	}
	@Test
	void addTwoNumber() {
		assertEquals(s.calc("1,2"),3);
	}

	@Test
	void addUnknownAmountOfNumber() {
		assertEquals(s.calc("1,2,3,4,5"),15);
	}
	
	@Test
	void NegativeNumberException() {
		assertEquals(s.calc("-1,2"),0);
	}

}
