import java.util.HashMap;

public class DistinctPair {
	
	public static int countPairsDiffK(int arr[], int n, int k) {
		int count =0;
		//int[][] arraypair = new int[n+1][n+1];
		HashMap<int[], String> pairs = new HashMap<>();
		pairs.put(new int[]{1, 2}, "Yes");
		pairs.put(new int[]{3, 4}, "Yes");
		System.out.println(pairs.values()+" "+pairs.keySet().toArray());
		
		for(int i =0; i< n; i++) {
			for (int j= i+1; j< n; j++) {
				if(( arr[i] - arr[j] == k ) || (arr[j] -arr[i] ==k)) {
					//arraypair[arr[i]][arr[j]] = -1;
					System.out.println(arr[i]+", "+arr[j]);
					
					pairs.put(new int[]{arr[i], arr[j]}, "Yes");				
					//System.out.println(pairs);
					count++;
				}
			}
		}
		
	/*	for(int i =0; i<n; i++) {
			for(int j= 0; j<n; j++) {
				if (arraypair[i][j] == -1) {
					System.out.println("Pairs: ("+arr[i]+","+arr[j]+")");
				}
			}
		}*/
		
		if(pairs.containsKey("Yes")) {
			System.out.println("Pairs: "+pairs);
		}
		
		return count;
	}

	public static void main(String[] args) {
		int arr[] = {1, 5, 2, 3, 4};
		int k =3;
		int n = arr.length;
		
		System.out.println("Pairs count with Diff "+k+" is "+countPairsDiffK(arr, n, k));
		
		StringBuffer stringBuf = new StringBuffer("Aarthi");
		StringBuffer reverseStringBuf = new StringBuffer(stringBuf);
		
		int length = stringBuf.length();
		for(int i = length -1; i >=0; i--) {
			reverseStringBuf.setCharAt((length-1-i), stringBuf.charAt(i));
		}
		System.out.println(stringBuf);
		System.out.println(reverseStringBuf);

	}

}
