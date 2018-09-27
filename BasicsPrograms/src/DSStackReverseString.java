import java.util.Stack;

public class DSStackReverseString {

	public static void reverseString(StringBuffer sb) {
		int n = sb.length();
		Stack stack = new Stack();
		
		System.out.println(n);
		if (n < 2 ) {
			System.out.println("no string");
			return;
		}
		for (int i=0; i< n;i++) {
			stack.push(sb.charAt(i));
		}
		for(int i=0; i< n; i++) {
			char ch = (char) stack.pop();
			sb.setCharAt(i, ch);
		}
		
	}
	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer("Aarthi");
		reverseString(sb);
		System.out.println("Reverses String :"+sb);		
	}

}
