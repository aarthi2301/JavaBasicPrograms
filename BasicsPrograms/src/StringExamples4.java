// String operations with Split & replace
// No of sentences, words, char's

public class StringExamples4 {

	public static void main(String[] args) {
		String text = "The giant panda has an insatiable appetite " +
					  "for bamboo. This panda lives in ice place. "+
					  " bamboo is not a plant";
		
		// No of sentences
		String[] sentences = text.split("\\.");
		System.out.println("The text has "+ sentences.length +" sentences.");
		
		//No of Words
		String[] words = text.split(" ");
		System.out.println("The text has "+words.length+" words.");
		
		//No of char's
		System.out.println("the text has "+ text.length()+ " char's.");
		
		String aarText = text.replace("bamboo", "aarthi");
		System.out.println(aarText);
	}

}
