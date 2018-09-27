import java.util.Stack;

import javax.print.DocFlavor.STRING;

public class DSStack {

	public static void main(String[] args) {
		Stack<String> cards = new Stack();
		//Stack<String> nameStack = new Stack();
		
		String c1 ="Jack : Diamonds";
		String c2 = "8 : Hearts";
		String c3 = "3 :clubs";
		
		System.out.println(cards);

		cards.push(c1);
		cards.push(c2);
		//cards.pop(); // c2- take out
		cards.push(c3);
		//cards.pop();
		//cards.pop();
		// cards.pop();// throws java.util.EmptyStackException
		
		System.out.println(cards);
		
		while(!cards.isEmpty()) {
			System.out.println(cards.pop());
		}
		System.out.println(cards);

		System.out.println("Found "+cards.search("Aarthi"));
			

	}

}
