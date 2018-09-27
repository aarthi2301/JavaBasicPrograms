// own code 25-Jul-2018
public class BinarySearch3 {

	private static int[] list = new int[] {0,1,2,3,4,5,6, 11, 14, 15, 20};
	
	public static void main(String[] args) {
		if (binarySearch(list, 20)) {
			System.out.println("Found 20");
		}
		if (binarySearch(list, 23)) {
			System.out.println("Not Found 23");
		}
	}
		
	
	public static boolean binarySearch(int array[], int search) {
		int first =0;
		int last = array.length -1;
		int middle =0;
		
		while (first<= last) {
			middle = (first + last)/ 2;
			if (array[middle] > search) {
				last = middle -1;
				return true;
			}
			else if (array[middle] == search) {
				return true;
			}
			else if (array[middle] < search) {
				first = middle + 1;
				return true;
			}
		
		}
		return false;
}
}
