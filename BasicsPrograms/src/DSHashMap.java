import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;

public class DSHashMap {

	public static void main(String[] args) {

		HashMap<String, Integer> nums = new HashMap();
		nums.put("ONE", 1);
		nums.put("TWO", 2);
		nums.put("THREE", 3);
		nums.put("FOUR", 4);
		
		//System.out.println(nums.values());
		//System.out.println(nums.keySet());
		
		System.out.println(nums.containsValue(5));
		System.out.println(nums.get("FOUR"));
		System.out.println(nums.getOrDefault("THREE", 3));
		
		System.out.println(nums.remove("TWO"));
		

		//System.out.println(nums.values());
		//System.out.println(nums.keySet());
		System.out.println(nums);
		
		String s = "phhhne";
		HashMap<Character, Integer> hashMap = new HashMap();
		
		for(int i=0; i< s.length(); i++) {
			Character c = s.charAt(i);
			
			if(hashMap.containsKey(c)) {
				hashMap.put(c, hashMap.get(c)+1);
				System.out.println("Repeated "+ hashMap);
				}
			else {
				hashMap.put(c, 1);
				System.out.println("Single "+ hashMap);

			}
		}
		System.out.println(hashMap.keySet());
		System.out.println(hashMap.values());
		
		int maxCnt = Collections.max(hashMap.values());
		Character repeatedKey = ' ';
		int curValue;
		for(char key : hashMap.keySet()) {
			curValue = hashMap.get(key);
			if ( curValue == maxCnt) {
				repeatedKey = key;
			}
		}
		if  (maxCnt >1) {
		System.out.println(repeatedKey +" is repeated" + " "+maxCnt +" Times");		
		}
		else {
			System.out.println("No char is repeating");
		}
	}

}
