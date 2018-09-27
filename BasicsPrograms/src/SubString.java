
public class SubString {

	public static void main(String[] args) {
		String s1 = "Aarthi";
		String s2 = "ln";
		
		char[] c1 =s1.toCharArray();
        char[] c2 =s2.toCharArray();
        for(int i=0; i< s1.length(); i++){
           for(int j=0; j<s2.length();j++){
               if(c1[i] == c2[j]){
                   //System.out.println("YES");
                   System.out.println("YES");
                   return;
               }
           }
       }
        
        System.out.println("NO");
	}

}
