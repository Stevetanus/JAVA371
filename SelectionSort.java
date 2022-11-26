package Demo;

public class SelectionSort {

	public static void main(String[] args) {
		int N = 1000;
		int[] A = new int[N];
		for(int i = 0; i < A.length; i++) {
			A[i] =(int) (Math.random() * N);
		}

		long startTime = System.nanoTime();
		for (int i = 0; i < N - 1; i++) {
						
			int min_idx = i;
			
			for (int j = i + 1; j < N; j++) {
				
				if (A[j] < A[i]) {
					min_idx = j;
					int temp = A[min_idx];
					A[min_idx] = A[i];
					A[i] = temp;
				}
				
			}
			
		}
		
		long duringTime = System.nanoTime() - startTime;

		double duringTimeInMs = (double) duringTime / 1_000_000;
		System.out.println(duringTimeInMs);
	}

}
