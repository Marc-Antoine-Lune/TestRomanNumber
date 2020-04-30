package tpTestExo2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestRomanNumbers {

	@Test
	public void testConvertsTheNumber1ToStringI() {
	var roman = new RomanNumber(1);
	assertEquals("I", roman.toString());
	}
	
	@Test
	public void testConvertsTheNumber5ToStringV() {
	var roman = new RomanNumber(5);
	assertEquals("V", roman.toString());
	}

}
