// Find vowels & Consonants count in given string
// Do it again

public class StringChallenge {

	public static void main(String[] args) {
	String s1 = "Hello";
	String s2 = "there is a quiet mouse";
	String s3 = "I am happy";
	String[] strings = {s1, s2, s3};
	String v = "aeiouy";
	//System.out.println(strings); // return address [Ljava.lang.String;@7852e922
	
	for (String s : strings) {
		int vCnt =0, cCnt =0;
		
		String normalized = (s.toLowerCase()).trim();
		System.out.println(normalized);
		
		char[] charArray = s.toCharArray();
		for (int i=0; i< charArray.length; i++) {
			if (charArray[i]== v.charAt(0) || charArray[i] == v.charAt(1) || charArray[i] == v.charAt(2) || charArray[i] == v.charAt(3) || charArray[i] == v.charAt(4) || charArray[i] == v.charAt(5)){
				vCnt = vCnt +1;
			}
			else if (charArray[i] != ' '){
				cCnt = cCnt+1;
			}
		}
		System.out.println("v Count" +vCnt);
		System.out.println("c Count" +cCnt);
		
		System.out.println( );
	} 


	}

}
