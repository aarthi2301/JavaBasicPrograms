// own code - 26-Jul-2018
public class MergeSort2 {

	//private static int A[] = new int[] {2, 4, 1,  6, 3, 5, 8, 7};
	private static int A[] = new int[] {2, 10, 1, 5, 1, 5, 10,4};
	public static void main(String[] args) {
		System.out.println("un-sorted array is ");
		for( int i= 0; i < A.length; i++) {
			System.out.println(A[i]);
		}
		mergeSort(A);
		
		System.out.println("sorted array is ");
		for( int i= 0; i < A.length; i++) {
			System.out.println(A[i]);
		}
	}
	
	private static void mergeSort(int A[]) {
	int n = A.length;
	if (n < 2) {
		return; // if only one element in the array- return
	}
	
	int mid = n/2;
	int L[] = new int [mid];
	int R[] = new int [n-mid];
	
	for( int i= 0; i < mid; i++) {
		L[i] = A[i];
		//System.out.println("L"+L[i]);
	}
	for(int i= mid; i< n; i++) {
		R[i-mid] = A[i];
		//System.out.println("R"+R[i-mid]);
	}
	mergeSort(L);
	mergeSort(R);
	merge(L, R, A);
	}
	
	// merge sorted L and R array into A
	
	private static void merge(int L[] , int R[], int A[]) {
	int nL = L.length;
	int nR = R.length;
	
	int i= 0, j=0, k=0;
	while (i< nL && j <nR) {
		if (L[i] < R[j]) {
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
		i = i+1;
		k = k+1;
	}
	
	while (j < nR) {
		A[k] = R[j];
		j = j+1;
		k = k+1;
	}
}

}
