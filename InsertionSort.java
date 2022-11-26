package Demo;

public class InsertionSort {

	public static void main(String[] args) {
		
		int N = 1000;
		int [] A = new int[N];
		for (int i = 0; i < N; i++) {
			A[i] = (int) (Math.random() * N);
		}
		long startTime = System.nanoTime();
		
		
		for (int i = 0; i < N; i++) {
			int key = A[i];
			int j = i - 1;
			
			while (j >= 0 && key < A[j]) {
				A[j + 1] = A[j];
				j--;
			}
			
			A[j + 1] = key;
		}
		
		long duringTime = System.nanoTime() - startTime;

		double duringTimeInMs = (double) duringTime / 1_000_000;
		System.out.println(duringTimeInMs);
		
	}

}
