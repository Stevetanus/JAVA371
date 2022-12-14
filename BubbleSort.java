package Demo;

public class BubbleSort {

	public static void main(String[] args) {
		int N = 1000;
		int[] A = new int[N];
		for(int i = 0; i < A.length; i++) {
			A[i] =(int) (Math.random() * N);
		}
		
		boolean swapped;
		
		long startTime = System.nanoTime();
		do {
			swapped = false;
			for (int i = 0; i < A.length - 1; i++) {
				if (A[i] > A[i + 1]) {
					int tmp = A[i];
					A[i] = A[i + 1];
					A[i + 1] = tmp;
					swapped = true;
				}
			}
		} while (swapped);

		long duringTime = System.nanoTime() - startTime;

		double duringTimeInMs = (double) duringTime / 1_000_000;
		System.out.println(duringTimeInMs);
	}

}
