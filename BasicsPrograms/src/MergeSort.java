// Referrence from youtube https://www.youtube.com/watch?v=TzeBrDU-JaY&index=6&t=0s&list=PL2_aWCzGMAwKedT2KfDMB9YA5DgASZb3U
// 26- Jul-2018
public class MergeSort {

	private static int[] array = new int[] {2, 4, 1, 6, 8, 5, 3, 7};
	public static void main(String[] args) {
		mergeSort(array);
		System.out.println("the sorted array is ");
		for( int i=0; i< array.length; i++) {
			System.out.println(array[i]);
		}

	}
	
	private static void mergeSort(int array[]) {
		
		int n = array.length;
		int middle = 0;
		
		if (n < 2) {
			return; //return if only 1 element in the array
		}
		
		middle = n/2;
		int[] lArray = new int[middle];
		int[] rArray = new int[n-middle];
		
		for(int i =0; i <= middle-1; i++) {
			//System.out.println("i: "+i+"Left array element:" + lArray[i]);
			lArray[i] = array[i];
		} 
		
		for(int i= middle; i <= n-1; i++) {
			rArray[i-middle] = array[i];
		}
		mergeSort(lArray);
		mergeSort(rArray);
		merge(lArray, rArray, array);
	}
	
	private static void merge(int L[], int R[], int A[]) {
		int nL= L.length;
		int nR= R.length;
		int i = 0, j= 0, k=0;
		
		while ( i < nL && j < nR) {
			if (L[i] <= R[j]) {
				A[k] = L[i];
				i = i+1;
				k = k+1;
			}
			else {
				A[k] = R[j];
				j = j+1;
				k = k+1;
			}
		}
		while (i < nL) {
			A[k] = L[i];
			i = i +1;
			k = k+1;
		}
		while (j < nR) {
			A[k] = R[j];
			j = j +1;
			k = k+1;
		}
	}

}
