package tpTestExo2;

public class RomanNumber {
	
	private String roman;
	public RomanNumber(int n) {
	if (n == 1 ) this.roman = "I";
	else if (n == 5) this.roman = "V";
	else if (n == 10) this.roman = "X";
	else if (n== 50) this.roman = "L";
	else if (n== 100) this.roman = "C";

	}
	
	@Override
	public String toString() {
	return roman;
	}

}
