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
	
	@Test
	public void testConvertsTheNumber10ToStringX() {
	var roman = new RomanNumber(10);
	assertEquals("X", roman.toString());
	}
	
	@Test
	public void testConvertsTheNumber50ToStringL() {
	var roman = new RomanNumber(50);
	assertEquals("L", roman.toString());
	}
	
	@Test
	public void testConvertsTheNumber100ToStringC() {
	var roman = new RomanNumber(100);
	assertEquals("C", roman.toString());
	}
	
	@Test
	public void testConvertsTheNumber500ToStringD() {
	var roman = new RomanNumber(500);
	assertEquals("D", roman.toString());
	}
	
	@Test
	public void testConvertsTheNumber1000ToStringM() {
	var roman = new RomanNumber(1000);
	assertEquals("M", roman.toString());
	}
	
	@Test
	public void testConvertsTheNumber2ToStringII() {
	var roman = new RomanNumber(2);
	assertEquals("II", roman.toString());
	}
	

	@Test
	public void testConvertsTheNumber20ToStringXX() {
	var roman = new RomanNumber(20);
	assertEquals("XX", roman.toString());
	}
	
	@Test
	public void testConvertsTheNumber30ToStringXXX() {
	var roman = new RomanNumber(30);
	assertEquals("XXX", roman.toString());
	}
	
	@Test
	public void testConvertsTheNumber200ToStringCC() {
	var roman = new RomanNumber(200);
	assertEquals("CC", roman.toString());
	}
	
	@Test
	public void testConvertsTheNumber120ToStringCXX() {
	var roman = new RomanNumber(120);
	assertEquals("CXX", roman.toString());
	}
	


}
