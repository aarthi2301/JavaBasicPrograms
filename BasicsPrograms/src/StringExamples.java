//StringBuilder Example

public class StringExamples {

	public static void main(String[] args) {
	
		String fName = "Aarthi";
		String lName = "Sivalingam";
		
		String name = fName + " " +lName;
		System.out.println(name); 
		
		String conCat = (fName.concat(" ")).concat(lName);
		System.out.println("Concat: "+conCat); 
		
		StringBuilder sb = new StringBuilder("abc");
		sb.append("def");
		sb.append("ghi");
		sb.append("jkl");
		sb.insert(6, "Sibi");
		//sb.delete(0, 4);
		String a = sb.toString();
		System.out.println(a);
	}

}
