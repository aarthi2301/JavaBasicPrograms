import java.util.LinkedList;

public class DSLinklist {

	public static void main(String[] args) {
		//Create a Linked List
		LinkedList<String> students = new LinkedList();
		students.add("Aarthi");
		students.add("Ilan");
		students.add("Sibiram");
		students.add("Kabilan");
		
		students.addFirst("Siva");
		students.add(1, "Raman");
		students.addLast("Kalai");
		
		System.out.println(students);
		
		students.removeLast();
		students.removeFirst();
		students.remove("Raman");
		
		System.out.println(students.size());
		
		System.out.println(students);
		int index = students.indexOf("Kabilan");
		System.out.println("index of Kabilan :"+index);
		
		System.out.println("first "+students.get(0));
		
		students.clear();
		System.out.println(students);

	}

}
