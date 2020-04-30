package tpTestExo2;

public class RomanNumber {
	
	private String roman;
	public RomanNumber(int n) {
	if (n == 1 ) this.roman = "I";
	else if (n == 5) this.roman = "V";
	}
	
	@Override
	public String toString() {
	return roman;
	}

}
