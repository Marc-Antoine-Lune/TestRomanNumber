package tpTestExo2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestRomanNumbers {

	@Test
	public void testConvertsTheNumber1ToStringI() {
	var roman = new RomanNumber(1);
	assertEquals("I", roman.toString());
	}

}
