package Demo;

public class BubbleSort {

	public static void main(String[] args) {
		int[] A = new int[5];
		for(int i = 0; i < A.length; i++) {
			A[i] =(int) (Math.random() * 100);
			System.out.printf("%3s", A[i]);
		}
		
		boolean swapped;
		
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
		
		for(int i = 0; i < A.length; i++) {
			System.out.printf("%3s", A[i]);
		}
	}

}
