package feb2022dsafundamentals;

import java.util.LinkedList;

import org.w3c.dom.Node;

public class LINKR {
	
	
	
			
			
	
public static class Node{
	
	String data;
	
	Node next;
	
}


	
	
	
 
	

	public static void main(String[] args) {
		
		
		Slist list = new Slist();
	
		list.insert("abbas");
		list.insert("kavtya");
		list.insert("dhoni");
		list.insert("gautam");
		list.insert("virat");
		list.insert("rohit");
		
		list.insertatstart("jadeja");
		

		
		
		list.insertat(0, "rishabh pant");
		
		list.deletion(3);
	
		list.show();
		

	}

}
