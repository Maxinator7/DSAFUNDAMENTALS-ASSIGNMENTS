package feb2022dsafundamentals;

public class RECURSION {
	
	static void print (int n) {
		
	//	if(n==0) {
		if(n>=10) {
			System.out.println(n);
			return;
		
		}
		
		
	print(n+1);
	System.out.println(n);
		//print(--n);  // 
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//print(10);
		print(1); // we will use recursion to print it backwards
	}

}
