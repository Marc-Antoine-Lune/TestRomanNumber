package tpTestExo2;

import java.util.Arrays;

public class RomanNumber {
	
	private String roman;
	private int[] numbersArray = {1, 5, 10, 50, 100, 500, 1000}; 
	private String[] romanArray = {"I", "V", "X", "L", "C", "D", "M"};
	
	
	public RomanNumber(int n) {
		int index = Arrays.binarySearch(numbersArray, n);
		this.roman = romanArray[index];	
	}
	
	@Override
	public String toString() {
	return roman;
	}

}
