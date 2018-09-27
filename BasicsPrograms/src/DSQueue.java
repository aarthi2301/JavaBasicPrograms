import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class DSQueue {

	public static void main(String[] args) {

		Queue<String> queue = new LinkedList();
		//Collections names = new Collections {"Ilan", "Rajesh", "SB"};
		queue.add("Aarthi");
		queue.add("Aish");
		queue.add("Balaji");
		queue.add("Buvana");
				
		System.out.println(queue);
		System.out.println("Next in line "+queue.peek());
		
		for(int i=0; i< queue.size();i++) {
			
			System.out.println("Recenetly removed "+queue.remove());
			System.out.println(queue); //stop if items are 2
		}
		
		queue.add("Meena");
		queue.add("Ramya");
		System.out.println(queue);
		
		System.out.println(queue.contains("Ramya"));
		//queue.addAll();
		
		queue.clear();
		System.out.println(queue);
		
		

	}

}
