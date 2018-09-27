import java.util.HashMap;
import java.util.Map;

public class InterviewQA {
	
	public InterviewQA() {
		int marks;
		String name;
	}

	public static void main(String[] args) {
		// Wrapping/unwrapping class example
		char ch = 'a';
		Character a = ch; //Wrapping Primitive type 'char' to 'Character' wrapper class.
		char ch2 = a; //unwrapping
		
		System.out.println(a.charValue());
		System.out.println(a.equals(a));
		System.out.println(a.compareTo('a'));
		System.out.println(a.toString());
		System.out.println(a.toUpperCase(ch)+a);
		// EOF Wrapping/unwrapping class example
		
		
		InterviewQA ObjArray = new InterviewQA();
		
		//1st duplicate char in a string
		
		String str = "Arthi";
		String str2 = str.toLowerCase();
		char[] c= str2.toCharArray();
		System.out.println(str2);
		
		HashMap<Character, Integer > hash = new HashMap<>();

		for(Character key : c) {
			if(hash.containsKey(key)) {
				hash.put(key, (hash.get(key) +1));
				System.out.println("1st Repeated Char "+ key);
				return;
			}
			else
			{
				hash.put(key, 1);				
			}
			System.out.println(hash);
		}	
		System.out.println("No char is repeating");
		// EOF duplicate string
		
		//In a given sorted array of integers remove all the duplicates
		int[] iarr = { 1, 2, 3, 4, 1,2, 4, 5, 4, 6};
		Map<Integer, Integer> iMap = new HashMap<>();
		
		for(int i =0; i < iarr.length; i++ ){
			if(iMap.containsKey(iarr[i])) {
				iMap.put(iarr[i], (iMap.get(iarr[i])+1));
			}
			else {
				iMap.put(iarr[i], 1);				
			}
		}		
		System.out.println("array after deleting duplicates "+iMap.keySet());	
		System.out.println(iMap.values());
		//EOF In a given sorted array of integers remove all the duplicates
		
		// >>>> Find the number of volwels (a,e,i,ou) in the above paragraph

		String str_V = "A vowel is one of the two principal classes of speech sound, the other being a consonant. Vowels vary in quality, in loudness and also in quantity (length). They are usually voiced, and are closely involved in prosodic variation such as tone, intonation and stress. Vowel sounds are produced with an open vocal tract. The word vowel comes from the Latin word vocalis, meaning 'voca' (i.e. relating to the voice).[1] In English, the word vowel is commonly used to refer both to vowel sounds and to the written symbols that represent them.";
		String str_V2 = str_V.toLowerCase(); 
		  char[] ch_V = str_V.toCharArray();
		  int count = 0;
		  
		  for(int i= 0; i< str_V.length(); i++){

			  if ((ch_V[i] == 'a') || (ch_V[i] == 'e') || (ch_V[i] == 'i') || ( ch_V[i] == 'o' )|| ( ch_V[i] == 'u') ){
				  count++;
				  }
		  }
		  System.out.println("Count" + count);
				  
		  // hashmap
		  HashMap<Character, Integer> VowelsHash = new HashMap<>();
		  VowelsHash.put('a',1);
		  VowelsHash.put('e',1);  
		  VowelsHash.put('i',1);
		  VowelsHash.put('o',1);  
		  VowelsHash.put('u',1);
		  count = 0;
		  for(Character c1 : ch_V) {
		  
			  if(VowelsHash.containsKey(c1)){
				  count++;
			  }
		  }
		  
		  System.out.println(count);

	}
}
