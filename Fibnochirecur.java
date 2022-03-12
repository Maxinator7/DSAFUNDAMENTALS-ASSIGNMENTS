package feb2022dsafundamentals;

public class Fibnochirecur {
	
	static int fib( int x) {
		
		// BASE CASE
		if(x==1) {
			return 1;
		}
		if(x==0) {
			return 0;
		}
		
	
		
	return fib(x - 1) + fib(x - 2);	
	
		
	}

	public static void main(String[] args) {
		 System.out.println(fib(9));
		
	}

}


