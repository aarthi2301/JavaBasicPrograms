import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class DistinctPairCntForSum {

	public static void main(String[] args) {
		Integer[] iarr = {1, 43, 1, 2, 3, 45, 46, 0};
		int sum = 46;
		int pairsCnt =0;
		//Collections coll = {11, 14, 12};
		
		Set<Integer> set = new HashSet<>(Arrays.asList(iarr));
		System.out.println(set +" Size "+set.size());
		
		set.add(10);
		//set.addAll(coll);
		System.out.println(set +" Size "+set.size());
		HashMap<Integer, Integer> hash = new HashMap<>();
		
		
	}

}
