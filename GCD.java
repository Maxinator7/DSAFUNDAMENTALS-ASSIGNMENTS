package feb2022dsafundamentals;

public class GCD {
	
	static int gcd(int dividend, int divisor) {
		
		if (divisor ==0) {
			return dividend;
		}
		return gcd(divisor,dividend % divisor);
		
	}

	public static void main(String[] args) {
		System.out.println(gcd(6,72));

	}

}
