package tpTestExo2;

import java.util.Arrays;

public class RomanNumber {
	
	private String roman= "";
	private int[] numbersArray = {1, 5, 10, 50, 100, 500, 1000}; 
	private String[] romanArray = {"I", "V", "X", "L", "C", "D", "M"};
	
	
	public RomanNumber(int n) {
			for (int i=this.numbersArray.length-1 ; i>=0; i--) {
				if(n/1000 == 9 ) {
					this.roman += "IXM";
					n -= 9000;
				}
				if(n/1000 == 4 ) {
					this.roman += "IVM";
					n -= 4000;
				}
				if(n == 4  && numbersArray[i] == 5 || n == 9 && numbersArray[i] == 10 ) {
					this.roman += "I" + romanArray[i];
					n -= numbersArray[i]-1;
				}
				if(n/10 == 4   && numbersArray[i] == 50 || n/10 == 9 && numbersArray[i] == 100 ) {
					this.roman += "X" + romanArray[i];
					n -= numbersArray[i]-10;
				}
				if(n/100 == 4 && numbersArray[i] == 500 || n/100 == 9 && numbersArray[i] == 1000 ) {
					this.roman += "C" + romanArray[i];
					n -= numbersArray[i]-100;
				}

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
