//String operations using char array

// Grab a char at specific index
// print a string if it contains substring
// Grab a substring using 2 indexes
// print a reverse string

public class StringExamples3 {
	
	public static String reverseString(String s) {
		StringBuilder stringBuilder = new StringBuilder();
		for(int i=s.length()-1; i>= 0; i--) {
			stringBuilder.append(s.charAt(i));
		}
		return stringBuilder.toString();
	}

	public static void main(String[] args) {		
		String a = "Apples";
		String b = "Bananas";
		String c = "Carrots";
		String ab = "Apples Bananas";
		String[] strings = { a, b, c, ab};
		char[] charArray;
		
		for (String s :strings) {
			/* int index = 0;
			System.out.println(s.charAt(index));
			
			charArray = s.toCharArray();
			System.out.println(charArray[5]);
			
			System.out.println(s.substring(3,5));
			
			s = s.toLowerCase();
			if(s.contains("app")) {
				System.out.println("Contains app");
			}
			*/
			System.out.println(reverseString(s));
			//System.out.println();
		}
	}

}
