package Demo;

public class SelectionSort {

	public static void main(String[] args) {
		int N = 5;
		int[] A = new int[N];
		for(int i = 0; i < A.length; i++) {
			A[i] =(int) (Math.random() * 100);
			System.out.printf("%3s", A[i]);
		}
		
		System.out.println();
		
		for (int i = 0; i < N - 1; i++) {
						
			int min_idx = i;
			
			for (int j = i + 1; j < N; j++) {
				
				if (A[j] < A[i]) {
					min_idx = j;
				}
				
			}
			if (min_idx != i) {
				int temp = A[min_idx];
				System.out.println(temp);
				A[min_idx] = A[i];
				A[i] = temp;
			}
		}
		
		for (int i = 0; i < N; i++) {
			System.out.printf("%3s", A[i]);
		}
	}

}
