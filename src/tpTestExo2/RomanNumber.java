package tpTestExo2;

import java.util.Arrays;

public class RomanNumber {
	
	private String roman= "";
	private int[] numbersArray = {1, 5, 10, 50, 100, 500, 1000}; 
	private String[] romanArray = {"I", "V", "X", "L", "C", "D", "M"};
	
	
	public RomanNumber(int n) {
		int index = Arrays.binarySearch(numbersArray, n);
		if (index >= 0)
		this.roman = romanArray[index];	
		else {
			for (int i=this.numbersArray.length-1 ; i>=0; i--) {
				if(n % this.numbersArray[i] == 0) {
					while(n>0) {
						this.roman += this.romanArray[i];
						n -= this.numbersArray[i];
					}
				}
			}
		}
	}
	
	@Override
	public String toString() {
	return roman;
	}

}
