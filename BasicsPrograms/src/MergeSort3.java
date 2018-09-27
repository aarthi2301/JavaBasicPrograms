// own try- 27-Jul-2018

public class MergeSort3 {

	private static int[] A = new int[] {4, 2, 1, 10, 8, 3, 5};
	
	public static void main(String[] args) {
		mergeSort(A);	
		for(int i =0; i< A.length; i++) {
			System.out.println(A[i]);
		}
	}
		
	private static void mergeSort(int[] A) {
		int n = A.length;
		if (n < 2) {
			return;
		}
		
		int mid = n/2;
		int L[] = new int[mid];
		int R[] = new int[n-mid];
		
		for (int i= 0; i< mid; i++) {
			L[i] = A[i]; 
			//System.out.println("L"+A[i]);
		}
		for (int i= mid; i< n; i++) {
			R[i-mid] = A[i]; // R[0], R[1], R[2], R[3]
			//System.out.println("R"+A[i]);
		}
		
		mergeSort(L);
		mergeSort(R);
		merge(L, R, A);
	}

	private static void merge(int L[], int R[], int A[]) {
		int nL= L.length;
		int nR= R.length;		
		int i=0, j=0, k=0;
		
		while(i<nL && j< nR) {
			if( L[i] < R[j]) {
				A[k] = L[i];
				i =i +1;
				k =k+1;
			}
			else if (L[i] > R[j]) {
				A[k] = R[j];
				j =j +1;
				k =k+1;
			}
		}
		
		while (i < nL) {
			A[k] = L[i];
			i =i +1;
			k =k+1;
		}
		while (j < nR) {
			A[k] = R[j];
			j =j +1;
			k =k+1;	
		}
	}
}
