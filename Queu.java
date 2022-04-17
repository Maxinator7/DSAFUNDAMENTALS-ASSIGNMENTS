package feb2022dsafundamentals;

public class Queu {
	
	int queu [] = new int [5];
	
	int size ;
	
	int front=0;
	int rear=0;
	
	
	public void enqueu (int data) {
		
		if(!isfull()) {
			
		
		
		queu[rear]=data;
		rear =(rear+1)%5;
		size=size+1;
		}
		else {
			System.out.println("Queu is full");
		}
		
	}
	

	
	public void show() {
		System.out.print("Elements : ");
		for(int i=0;i<size;i++) {
			
			System.out.print(queu[(front+i)%5]+" ");
		}
		
		System.out.println();
		
//		for (int n:queu) {
//			System.out.print(n+ " ");
//		}
//		System.out.println();
	}
	public void dqueu() {
		
		if(!isempty()) {
			
		
		queu[front]=0;
		front= (front+1)%5;
		size=size-1;
		
		}
		
		else {
			System.out.println("Queu is empty ");
		}
	}
	public int getsize() {
		return size;
		
	}
	
	public boolean isempty() {
		
		return getsize()==0;
	}
	
	public boolean isfull() {
		
		return getsize()==5;
	}

}
