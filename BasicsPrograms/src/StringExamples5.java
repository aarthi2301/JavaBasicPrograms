// String equality "==" ,  equals() - differences
// String Literal & String Instance

public class StringExamples5 {

	public static void main(String[] args) {
		String literal1 = "hello";
		String literal2 = "hello";
		String obj1 = new String ("hello");
		String obj2 = new String ("hello");
		
		System.out.println(literal1 == literal2);	   // check ref  - true
		System.out.println(literal1.equals(literal2)); // check values- true
		
		System.out.println(literal1 == obj1);  		// false
		System.out.println(literal1.equals(obj1)); 	// true
		
		System.out.println(obj1 == obj2);			//false- diff ref
		System.out.println(obj1.equals(obj2));		//true
		
	}

}
