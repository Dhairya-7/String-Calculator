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
	void negativeNumberException() {
//		assertEquals(s.calc("-1,2"),0);
		try {
			s.calc("-1,2");			
		}
		catch(IllegalArgumentException e) {
			e.getMessage();
		}
	}
	@Test
	void newLineDelimiter() {
		assertEquals(s.calc("1\n2,3"),6);
	}
	@Test
	void customDelimiter() {
		assertEquals(s.calc("//;\\n1;2"),3);
	}
	@Test
	void numberGreaterThan1000() {
		assertEquals(s.calc("1000,1"),1);
	}
	@Test
	void anyLengthDelimiter() {
		assertEquals(s.calc("//[;;]\\n1;;2"),3);
	}
	@Test
	void moreThanOneCustomDelimiters() {
		assertEquals(s.calc("//[;][*]\\n1;2*3"),6);
	}
}
