package feb2022dsafundamentals;

public class Dstack {
	
	int capacity = 2;
	
int stack[]= new int[capacity];
	
	int Top = 0;
	
	public  int size() {
		int s=stack.length;
		return s;
	}
	
	public void push(int data) {
		
		if (Top==capacity) {
			
			expand();
		}
		
		stack[Top] = data;
		Top++;
		
	}
	
	private void expand() {
		
		
		
		int newstack []= new int [capacity*2];
		
		
		int size1 = size();
		System.arraycopy(stack, 0, newstack, 0, size1);
		
		stack = newstack;
		capacity*=2;
		
		
	}

	
	public void pop() {
		
		if (Top<(capacity/2) ) {
			shrink();
		}
		
		System.out.println("emement" + stack[Top-1]+ "is poped");
		
		stack[Top]=0;
		
	
		
		Top--;
		
	}
	
private void shrink () {
		int redux = capacity/2;
	int newstack []= new int [redux];
	
	System.arraycopy(stack, 0, newstack, 0, redux);
	
	stack = newstack;
	capacity/=2;
		
	}
	
	public void Show() {
		
		for(int n : stack) {
			System.out.print(  n + " ");
			
			
		}
		System.out.println(" ");
	}
	
	public void peek() {
		
		System.out.println(" element at Top is "+stack[Top-1]);
	}
	
	

	
	
}
