package Demo;

public class SelectionSort {

	public static void main(String[] args) {
		int N = 10;
		int[] A = new int[N];
		for(int i = 0; i < A.length; i++) {
			A[i] =(int) (Math.random() * N);
			System.out.print(A[i] + " ");
		}

		long startTime = System.nanoTime();
		for (int i = 0; i < A.length - 1; i++) {
						
			int min_idx = i;
			
			for (int j = i + 1; j < A.length; j++) {
				
				if (A[j] < A[min_idx]) {
					min_idx = j;
				}

			}

			int temp = A[min_idx];
			A[min_idx] = A[i];
			A[i] = temp;			
		}
		
		System.out.println();
		for (int i = 0; i < A.length; i++) {
			System.out.print(A[i] + " ");
		}
		
		long duringTime = System.nanoTime() - startTime;

		double duringTimeInMs = (double) duringTime / 1_000_000;
		System.out.println(duringTimeInMs);
	}

}
