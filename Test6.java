package feb2022dsafundamentals;

public class Test6 {
	
	

	public static void main(String[] args) {
		
 String samp = "APPLE" ;
 int count=0;
 
   
   
   for (int i=0;i<=samp.length();i++){
	   
	   for (int j =i+1;j<=samp.length();j++) {
		    
		   System.out.println(samp.substring(i, j));
		   count++;
		   
		  
	   }
	 
	   
   }
   
  int temp=samp.length()-1;
  
	   
   System.out.println("Total NUmber of words"+ " "+(count+temp));
 
	}

}
