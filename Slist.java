package feb2022dsafundamentals;

import feb2022dsafundamentals.LINKR.Node;

public class Slist extends LINKR {
	
Node head;
	
	public void insert(String data) {
		
		Node node = new Node();
		
		node.data= data;
		
		node.next= null;
		
		if (head==null) {
			
			head=node;
		
		}
		else {
			
			Node n = head;
			while(n.next!=null) {
				n = n.next;
			}
			n.next=node;
			
		}
	}
	
	public void insertatstart (String data) {
		
		Node node = new Node();
		
		node.data= data;
		node.next= null;
		node.next=head;
		head=node;
		
	}
	
	public void insertat(int index,String data) {
		
         Node node = new Node();
		
		node.data= data;
		node.next= null;
		
	Node n = head;
	
	
	if (index==0) {
		
	insertatstart(data);
	
	}
	else {
		
		for (int i = 0;i<index-1;i++) {
			
			n=n.next;
		}
		
		node.next=n.next;
		
		n.next=node;
		
	}
	}
	
	public void deletion(int index) {
		
		Node 	n = head;
		Node n1 = null;
		
		if (index==0) {
			head=head.next;
		}
		else {
			
		
			for (int i = 0;i<index-1;i++) {
				
				n=n.next;
			}
			
			n1=n.next;
			n.next=n1.next;
			System.out.println("Removed : "+n1.data);
			n1=null;
			
			
			
		}
		}
			
			
	
	
	public void show() {
		
		Node n = head ;
		
		 while (n.next!=null) {
			 System.out.println(n.data);
			 n=n.next;
		 }
		 System.out.println(n.data);
	}

}


