import java.util.HashMap;

// Reverse a string using char Array
// char[] charArray = str.toCharArray()
// str = String.valueOf(charArray)
// Check if 2 strings are Anagrams

public class ReverseString {
	public static String reverseString(String str ) {
		
		int f=0;
		int l =str.length()-1;
		char temp;
		char[] charArray = str.toCharArray(); // IMPORTANT
		
		for (int i =0; i< str.length()/2; i++) {
			temp = charArray[f];
			charArray[f] = charArray[l];
			charArray[l] = temp;
			f++;
			l--;		
		}		
		System.out.println(str);
		str = String.valueOf(charArray); // IMPORTANT
		return str;
		
	}

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("AarthiIlan");
		StringBuffer rsb = new StringBuffer(sb);
		System.out.println(sb.length());
		for(int i= sb.length()-1; i >=0 ; i--) {
			rsb.setCharAt(i, sb.charAt((sb.length()-1)-i));
		}
		System.out.println(rsb);
		String str = "Aarthi";
		System.out.println("Reversed string from method: "+reverseString(str));
		
		/*for(int i= str.length()-1; i>= 0; i--) {
			System.out.print(str.charAt(i));
		} */
		
		// Anagram code 
		String str1 = "Aarthi";
		String str2 = "rtAaih";
		
		System.out.println("String-1 is: "+str1); // make lower case before using
		System.out.println("String-2 is: "+str2); // make lower case before using
		
		HashMap<Character, Integer> hash = new HashMap<>();
		
		for(int j=0; j<str1.length(); j++) {
			hash.put(str1.charAt(j), 1);
		}
		System.out.println("String-1 is: "+str1+ "Hash values: "+hash);
		
		if(str1.length()== str2.length()) {
			for(int i=0; i<str2.length(); i++) {
				if(hash.containsKey(str2.charAt(i))) {
					//System.out.println(str2.charAt(i));				 
				}
				else {
					System.out.println("NOT anagram");
					return;
				}
			}
			System.out.println("Both are Anagrams");
		}
		else {
			System.out.println("NOT anagram");
		}
		
		// EOF Anagram code
	}
	
	
}
