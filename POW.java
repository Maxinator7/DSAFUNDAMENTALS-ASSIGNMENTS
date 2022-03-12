package feb2022dsafundamentals;

public class POW {
	
static int POW(int DIGIT, int POWER) {
		
		if (POWER == 0) {
			return 1;
		}
		return DIGIT*POW(DIGIT,POWER-1);
		
	}

public static void main(String[] args) {
	System.out.println(POW(2,5));

}
}
