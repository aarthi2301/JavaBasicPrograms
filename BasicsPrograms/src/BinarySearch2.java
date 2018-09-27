// Working code -referred youtube

public class BinarySearch2 {

	// Binary search on sorted list
	private static int[] list = new int[] {0,1,2,3,4,5,6,7,8,9};
	
	public static void main(String[] args) {
		if (binarySearch(list, 0)){
			System.out.println("found 0");
		}
		
		if (binarySearch(list, 15)){
			System.out.println("not found 15");
		} 
		
	}
	
	private static boolean binarySearch( int[] array,  int search) {
		int first = 0;
		int last = array.length-1;
		int middle = 0;
		
		while (first <= last) {
			middle = (first + last )/2;
			
			if (array[middle] < search ){
				first = middle +1;
				return true;
			}
			else if (array[middle] == search ) {
				return true;
			}
			else if (array[middle] > search) {
			last = middle -1;
			return true;
			}	
			
		}
		
		return false;
	}

}
