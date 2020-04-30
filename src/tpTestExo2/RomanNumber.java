package tpTestExo2;

import java.util.Arrays;

public class RomanNumber {
	
	private String roman= "";
	private int[] numbersArray = {1, 5, 10, 50, 100, 500, 1000}; 
	private String[] romanArray = {"I", "V", "X", "L", "C", "D", "M"};
	
	
	public RomanNumber(int n) {
			for (int i=this.numbersArray.length-1 ; i>=0; i--) {
				if(n >= numbersArray[i]) {
					while(n>=numbersArray[i]) {
						this.roman += this.romanArray[i];
						n -= this.numbersArray[i];
					}
				}
			}
	}
	
	@Override
	public String toString() {
	return roman;
	}

}
