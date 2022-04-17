package feb2022dsafundamentals;

public class Recfacto {

	
	static int factum(int num) {
	// factorial resursion 
		if (num<=1) {
			return num;
		}
		
		return num * factum(num-1);
		
		
	}
	
//		if (num==0) {
//			return 0;
//		}
//	if (num==1) {
//		return 1;
//	}
//	else 
//	
//	return factum(num-2) + factum(num-1);
//	
//	
//}

	public static void main(String args[]) {
		
		System.out.println(factum(5));
	}
}
