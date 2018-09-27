// String array - isEmpty(), length(), trim() methods

public class StringExamples2 {

	public static void main(String[] args) {
		String p = "   Panda";
		String h = "Horse  ";
		String m = "MONkey";
		String n = " ";
		String[] strings = {p, h, m, n};
		
		for(String s: strings) {
			System.out.println(s);
			s = s.trim();
			System.out.println(s);
			
			if(!(s.isEmpty()) ){
				System.out.println("Not empty "+s);
			}
			else if(s.isEmpty()) {
				System.out.println("Empty String "+s);
			}
			if (s.length()>3) {
				System.out.println("More than 3 char "+s);

			}
			System.out.println(s.toLowerCase());
			System.out.println(s.toUpperCase());


		}
		
		
		String name = "Aarthi";
		StringBuilder sb = new StringBuilder();
		for(int i =(name.length())-1; i>= 0; i--) {
			sb.append(name.charAt(i));
		}
		System.out.println("Reversed string "+sb.toString());
	}

}
