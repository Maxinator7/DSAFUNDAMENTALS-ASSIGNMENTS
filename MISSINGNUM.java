package feb2022dsafundamentals;
// program for finding 1st missing array missing element in an array
public class MISSINGNUM {
	
	
  static class missno {
	
	  
 int smn (int sample [], int low,int high){
	
	
		  if (low>high) {
			  System.out.println(high+1);
          	return high+1;
          
		  }
		  if (low!= sample[low]) {
			  System.out.println(low);
	          	return low;
	            
	              }
		  
		  int mid = low + (high - low) / 2;
	    		  
	        if ( sample[mid]== mid) {
	            	return smn (sample, mid+1,high);  
	        }
	         if (sample[mid]!= mid) {
	        	return smn (sample, low,mid-1);
	        }
		
		
		
		return smn (sample, low,high);
		
	}
}
	public static void main(String[] args) {
		
	             missno ab = new missno();
	          
	             int sample []= {0,1,3,5,6,7,8,9,10,11,13};
	             
	             int high = sample.length;

	       
               ab.smn(sample,0,high);
	}
 
}
  
