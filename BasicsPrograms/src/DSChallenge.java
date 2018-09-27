// Do it fully


public class DSChallenge {

	public static void main(String[] args) {

		String text = "The giant panda has an insatiable appetite " +
				  "for bamboo.This panda lives in ice place."+
				  "bamboo is not a plant";
		
		String[] sentences =text.split("\\.");
		System.out.println("Sentences cnt :"+sentences.length);
		
		String sentenceString = "";
		
		for (int i= 0; i< sentences.length ; i++) {
			System.out.println(sentences[i]);
			
			sentenceString.concat(sentences[i]); 
			System.out.println(sentenceString);
		}
		String[] words;
		
		for (int i=0; i< sentences.length ; i++) {
			String sentence = sentences[i];
			words = sentence.split(" ");
			System.out.println("Words cnt :"+words.length);
		}
				
		/* for (String s : words ) {
			s.trim().toLowerCase();
			System.out.println(s);
		} */
	}

}
