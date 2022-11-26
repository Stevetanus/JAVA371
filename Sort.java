package Demo;

import java.util.Arrays;

public class Sort {

	static double bubbleSort(int n) {
		int[] A = new int[n];
		for(int i = 0; i < A.length; i++) {
			A[i] =(int) (Math.random() * n);
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
		return duringTimeInMs;
	}
	
	static double insertionSort(int n) {
		
		int [] A = new int[n];
		for (int i = 0; i < n; i++) {
			A[i] = (int) (Math.random() * n);
		}
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

		double duringTimeInMs = (double) duringTime / 1_000_000;
		return duringTimeInMs;
		
	}

	static double selectionSort(int n) {
		int[] A = new int[n];
		for(int i = 0; i < A.length; i++) {
			A[i] =(int) (Math.random() * n);
		}

		long startTime = System.nanoTime();
		for (int i = 0; i < n - 1; i++) {
						
			int min_idx = i;
			
			for (int j = i + 1; j < n; j++) {
				
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
		return duringTimeInMs;
	}

	static double arraysSort(int n) {
		int[] A = new int[n];
		for(int i = 0; i < A.length; i++) {
			A[i] =(int) (Math.random() * n);
		}

		long startTime = System.nanoTime();
		
		Arrays.sort(A);

		long duringTime = System.nanoTime() - startTime;

		double duringTimeInMs = (double) duringTime / 1_000_000;
		return duringTimeInMs;
	}
	
	public static void main(String[] args) {
		System.out.println(bubbleSort(1000));
		System.out.println(selectionSort(1000));
		System.out.println(insertionSort(1000));
		System.out.println(arraysSort(1000));
		System.out.println(bubbleSort(16000));
		System.out.println(selectionSort(16000));
		System.out.println(insertionSort(16000));
		System.out.println(arraysSort(16000));
		System.out.println(bubbleSort(32000));
		System.out.println(selectionSort(32000));
		System.out.println(insertionSort(32000));
		System.out.println(arraysSort(32000));
		
	}

}
