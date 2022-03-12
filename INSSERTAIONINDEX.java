package feb2022dsafundamentals;

public class INSSERTAIONINDEX {

	static class solution{
		
		
		
		
		
		 void insert(int array[],int n,int target){
			
			
			int start=0;
			
			int end = n;
			
			
			
			while (start<=end) {
				int mid = (start + (end-start)/2);
				
//				if( target > array[array.length] ) {
//					System.out.println("target is not present and can be inserted at index"+ add );
//				
//			}
				
				if (array[mid]==target) {
					System.out.println("element found at  index "+ array[mid]);
					break;
				}
				else if (array[mid]<target) {
					 start = mid+1;
				}
				else if (array[mid]>target) {
					 end = mid-1;
				}
				
					if ( start > end ){  
			      System.out.println("Element is not found!"); 
			     System.out.println("element can be inserted at index "+  (end+1));
			   } 
				
				
			}
	
			
			
		}
	}
	
	public static void main(String[] args) {
		solution klass = new solution();
		int array [] = {0,1,2,3,4,5,6,7,8,9,10};
		int n = array.length-1;
		int target = 5;	
		klass.insert(array,n,target);
		
	}

}
