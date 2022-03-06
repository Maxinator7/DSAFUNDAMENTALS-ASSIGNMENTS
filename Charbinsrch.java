package feb2022dsafundamentals;

public class Charbinsrch {

	public static void main(String[] args) {
		char arr [] = {'a','b','d','e','f','g','h','i','x','z'};

		 int first = 0;
		int last = arr.length;
		 char key= 'z';
		int mid = first + (last - first)/2;  
		   while( first <= last ){  
		     
			if ( arr[mid] < key ){  
		        first = mid + 1;     
		      }else if ( arr[mid] == key ){  
		        System.out.println("Element is found at index: " + mid);  
		        break;  
		      }else{  
		         last = mid - 1;  
		      }  
		      mid = (first + last)/2;  
		   }  
		   if ( first > last ){  
		      System.out.println("Element is not found!");  
		   }  
		  
	}

}
