package feb2022dsafundamentals;

public class RECPROB1 {
	// WHERE ODD =2 & EVEN =1 RETURN TOTAL COUNT FOR GIVEN RANGE 
	static int METH1(int num){
		
		if(num==0) {
			return 0;
		}
		 if ( num % 2 == 0) {
			 return 2+ METH1( num-1);
		}
		 else {
			 return 1+ METH1( num-1);
		 }
	
	}

	public static void main(String[] args) {
		System.out.println(METH1(8));

	}

}
