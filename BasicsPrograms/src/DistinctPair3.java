// Working code.....

import java.util.HashMap;
import java.util.Map;

public class DistinctPair3 {

	public static void main(String[] args) {

		Integer[] iarr = {1,2,46, 1 };//, 3, 0 , 46, 0, 1, 44, 3};
		int sum = 47;
		int pairsCnt =0;
		
		//Set<Integer> set = new HashSet<>(Arrays.asList(iarr));
		//System.out.println(set);
		
		//Collections<Integer> coll;
		//int[] sortedArr = coll.stream().mapToInt(Number::intValue).toArray();
		
		System.out.println("Given integer array");
		for(int k=0; k<iarr.length;k++) {
			System.out.print(iarr[k]+" ");
		}
		System.out.println(" ");
	
		//HashMap<Integer, Integer> hash = new HashMap<>();
		Map<Integer, Integer> pairs = new HashMap<>();
		if(iarr.length < 2) {
			System.out.println("No pairs. only one item in the array");
			return;
		}		
		for(int i= 0; i<iarr.length; i++) {	
			for(int j=i+1; j<iarr.length;j++) {
				if((iarr[i]+iarr[j]) == sum) {
					if ( (pairs.containsKey(iarr[i])) || (pairs.containsKey(iarr[j])) ) {
					}
					else {
						pairs.put(iarr[i], iarr[j]);
						pairsCnt++;
					}					
				}	
					
			}
		}
		if(pairs.isEmpty()) {
			System.out.println("No distinct pairs for sum "+sum);
		}
		else {
			System.out.println(pairs.keySet()+":"+pairs.values());
			System.out.println("Distinct Pair count for sum " +sum+ " is: "+pairsCnt);	
		}
	}

}
