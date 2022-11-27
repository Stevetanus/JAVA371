package Demo;

import java.util.Arrays;

public class Sort {
	
	static int[] randomArray(int n) {
		int[] A = new int[n];
		for(int i = 0; i < A.length; i++) {
			A[i] =(int) (Math.random() * n);
		}
		return A;
	}

	static double bubbleSort(int n) {
		int[] A = randomArray(n);
		
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

		float duringTimeInMs = (float) duringTime / 1_000_000;
		return duringTimeInMs;
	}
	
	static double selectionSort(int n) {
		int[] A = randomArray(n);

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
		
		long duringTime = System.nanoTime() - startTime;

		float duringTimeInMs = (float) duringTime / 1_000_000;
		return duringTimeInMs;
	}
	
	static double insertionSort(int n) {
		int[] A = randomArray(n);
		
		long startTime = System.nanoTime();
		
		for (int i = 0; i < n; i++) {
			int key = A[i];
			int j = i - 1;
			
			while (j >= 0 && key < A[j]) {
				A[j + 1] = A[j];
				j--;
			}
			
			A[j + 1] = key;
		}
		
		long duringTime = System.nanoTime() - startTime;

		float duringTimeInMs = (float) duringTime / 1_000_000;
		return duringTimeInMs;	
	}

	static double arraysSort(int n) {
		int[] A = randomArray(n);

		long startTime = System.nanoTime();
		
		Arrays.sort(A);

		long duringTime = System.nanoTime() - startTime;

		float duringTimeInMs = (float) duringTime / 1_000_000;
		return duringTimeInMs;
	}
	
	static void printSort(int n) {
		System.out.println();
		System.out.printf("%8d", n);
		System.out.printf("%16.3f", bubbleSort(n));
		System.out.printf("%16.3f", selectionSort(n));
		System.out.printf("%16.3f", insertionSort(n));
		System.out.printf("%16.3f", arraysSort(n));
	}
	
	public static void main(String[] args) {
		System.out.print("  " + "Benchmark (time unit: ms)" );
		System.out.println();
		System.out.printf("%8s", "Size");
		System.out.printf("%16s", "Bubble Sort");
		System.out.printf("%16s", "Selection Sort");
		System.out.printf("%16s", "Insertion Sort");
		System.out.printf("%16s", "Arrays Sort");
		printSort(1000);
		printSort(2000);
		printSort(4000);
		printSort(8000);
		printSort(16000);
		printSort(32000);
		printSort(64000);
	}

}
