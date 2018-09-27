// ******  Not working **** Refer BinarySearch2 program ******

public class BinarySearch {
	int binarySearch( int arr[], int start, int a_len, int x) {
		if (arr[a_len-1] < x) 
			return -1;
		if (arr[0] > x )
			return -1;
		
		if (a_len >= 1) {
			int last = a_len -1;
			int mid = (start +  last) /2; 
			System.out.println("mid index: "+mid);
			if (arr[mid] == x) 
				return arr[mid];
						
			if (arr[mid] > x ) {
				System.out.println("start: "+start);
				return binarySearch(arr, start, mid-start , x);	
			}			
			return binarySearch(arr, mid +1 , a_len-1 , x);
			
		}
		return -1;
	
	}
	

	public static void main(String[] args) {
	BinarySearch bs = new BinarySearch();
	int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	int a_len = arr.length;
	int start = 0;
	int x = 10;
	System.out.println("array lenght " + a_len);
	int result = bs.binarySearch(arr, start, a_len, x);
	if (result == -1)
		System.out.println(x +" is not present");
	else
		System.out.println("Element found: "+result);
	}

}
