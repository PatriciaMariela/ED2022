package steque;

public class ClienteSteque {

	public static void main(String[] args) {
		Steque<String> s = new Steque<>();
		
		System.out.println("s.isEmpty(): "+ s.isEmpty());
		
		s.push("Luna");
		System.out.println("s.push(\"Luna\"): ");
		System.out.println("s.isEmpty(): "+ s.isEmpty());
		
		
		s.enqueue("Maria");
		System.out.println("s.top(): "+ s.top());
		
		s.pop();
		System.out.println("s.top()  " + s.top());
		
		s.makeEmpty();
		System.out.println("s.isEmpty(): "+ s.isEmpty());
		
		

	}

}
