import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class DistinctPair2 {
	
	public static int SumPairs(Integer[] input, int k){
	    Map<Integer, Integer> frequencies = new HashMap<>();
	    int pairsCount = 0;      

	    for(int i=0; i<input.length; i++){
	        int value = input[i];
	        int complement = k - input[i];

	        if(frequencies.containsKey(complement)){                
	            int freq = frequencies.get(complement) - 1;
	            pairsCount++;
	            //System.out.println(value + ", " + complement);    
	            if(freq == 0){
	                frequencies.remove(complement);
	            }else{
	                frequencies.put(complement, freq);
	            }
	        }else{
	            if(frequencies.containsKey(value)){         
	                frequencies.put(value, frequencies.get(value) + 1);             
	            }else{
	                frequencies.put(value, 1);
	            }
	        }
	    }
	    return pairsCount;
	}

	public static void main(String[] args) { // Working code done by Aarthi
		Integer arr[] = {1, 45, 1, 45};
		int k =46;
		int n = arr.length;
		int count =0;
		Map<Integer, Integer> hash = new HashMap<>();
		
		for(int i=0; i< n;i++) {
			for(int j=i+1; j<n; j++) {
				if ((arr[i]+arr[j]) == k) {
					hash.put(k, count++);
				}
			}
		}
		// System.out.println(hash.keySet());
		// System.out.println(hash.values());		
		System.out.println("Pair count is: "+hash.get(k));
		
		
		/* Properties p = System.getProperties();
		Enumeration keys = p.keys();
		while (keys.hasMoreElements()) {
		    String key = (String)keys.nextElement();
		    String value = (String)p.get(key);
		    System.out.println(key + ": " + value);
		} */
		
		
		//System.out.println("Pair count: "+count);
		System.out.println("Pairs count with sum "+k+" is "+ SumPairs(arr, k));
	}

}
