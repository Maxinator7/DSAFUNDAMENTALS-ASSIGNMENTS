package feb2022dsafundamentals;

public class Stack {
	
	int stack[]= new int[10];
	
	int Top =0;
	
	public void push(int data) {
		
		stack[Top] = data;
		Top++;
		
	}
	
	public void pop() {
		
		System.out.println("emement" + stack[Top-1]+ "is poped");
		
		stack[Top]=0;
		
	
		
		Top--;
		
	}
	
	public void Show() {
		
		for(int n : stack) {
			System.out.print(  n + " ");
			
		}
	}
	
	public void peek() {
		
		System.out.println(" element at Top is "+stack[Top-1]);
	}
	
	
	
	}
