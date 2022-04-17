package feb2022dsafundamentals;

public class Rec {

	// printing numbers using Head Recursion
//	static void printnum(int num) {
//		
//		
//		if(num==0) {
//			return;
//		}
//		System.out.print(num + " ");
//		printnum(num-1);
//		
//		
//	}
	
	

	
	
static void printnum(int num) {
	
	
	// printing numbers using tail Recursion 
		if(num==0) {
			return;
		}
		
		printnum(num-1);
		System.out.print(num + " ");
		
	}

	    public static void main(String[] args) {
	       
	    	printnum(10);
	    }

}
