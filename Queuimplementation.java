package feb2022dsafundamentals;

public class Queuimplementation {

	public static void main(String[] args) {
		Queu line = new Queu();
		
		line.enqueu(1);
		line.enqueu(20);
		line.enqueu(21);
		line.enqueu(22);
		line.enqueu(23);
		line.show();
		
	    line.dqueu();
	    
         line.show();
         
         
	     line.enqueu(24);
	     line.show();
		line.enqueu(25);
		
		line.dqueu();
	
		line.dqueu();
		line.dqueu();
		
	line.enqueu(228);
	line.dqueu();
	line.dqueu();
	line.dqueu();
	line.dqueu();
	
	System.out.println(line.getsize());
	System.out.println(line.isempty());
	System.out.println(line.isfull());
	line.show();
		
	}

}
