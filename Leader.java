
package feb2022dsafundamentals;
public class Leader {
	
	static int templeader=0;

	public static void main(String[] args) {
		int arr[]= {8,-1,6,0,7,1,5};
		
		for (int i=arr.length-1;i>=0;) {
			
			if(arr[i]-1>arr[i]) {
				i--;
			}
			else {
				if(arr[i]>templeader) {
				
				 templeader = arr[i];
				System.out.println("current leader elemeent : "+arr[i]);
				}
				i--;
				
			}
	
		}
		System.out.println("final leader element:"+ templeader);
	}

}
