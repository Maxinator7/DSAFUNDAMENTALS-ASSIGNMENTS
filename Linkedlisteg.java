package feb2022dsafundamentals;

import java.util.LinkedList;

public class Linkedlisteg {

	public static void main(String[] args) {
	
		LinkedList <Integer> chain = new LinkedList<>();
		
		chain.add(1);
		chain.add(10);
		chain.add(8);
		chain.add(50);
		chain.add(120);
		chain.add(20);
		chain.add(7);
		
		
		System.out.println(chain.toString());
		
		chain.removeLast();
		
		chain.sort(null);
		
		chain.addFirst(2002);
		
		chain.pop();
		
		chain.push(55);
		
		
		System.out.println(chain.get(chain.size()-1).toString());
		
		
		System.out.println(chain.get(chain.size()/2).toString());
		
		System.out.println(chain.toString());
		
		
		
		System.out.println(chain.toString());

	}

}
