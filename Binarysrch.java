package feb2022dsafundamentals;

public class Binarysrch {
	
	
	public static void main(String[] args){
		 int arr[] = { 1, 1,2, 2, 4,5,5, 6,6,6,6,9, 10, 11 };
		 
		int n = arr.length;
		int key = 6;
		int count = 0;
		
		 for (int i = 0; i < n; i++) {
	            if (key != arr[i])
	                continue;
	            if(key==arr[i]) {
	            	
					count++;
	            }
		 }
		 System.out.println(key+" "+"appears for"+" "+count+" "+"times");
		
}
}


