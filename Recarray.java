package feb2022dsafundamentals;

public class Recarray {

	static int [] a = {1,2,3,4,5};
	
	int n;
	
	static void Arrrec( int []a , int n) {
		
		
		
		if(n==a.length-1) {
			System.out.println("End of an array");
			return;
		}
		
		if(a[n]%2==0) {
			System.out.println(n);
			
		}
		Arrrec(a , n+1);
	}
	public static void main(String[] args) {
		
		 Arrrec(a,0);
	}
	
}
