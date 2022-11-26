package Demo;

// ref: https://stackoverflow.com/questions/4191687/how-to-calculate-mean-median-mode-and-range-from-a-set-of-numbers

public class Descriptive {

	static double myMedian(double[] m){
		int middle = m.length / 2;
		if (m.length % 2 == 1) {
			return m[middle];
		} else {
			return (m[middle] + m[middle + 1]) / 2.0;
		}
	}
	
	static double myMean(double[] m) {
		double sum = 0;
		for (int i = 0; i < m.length; i++) {
			sum += m[i];
		}
		System.out.println("sum = " + sum);
		return sum / m.length;
	}
	
	static double myMode(double[] m) {
		double maxValue = 0;
		int maxCount = 0;
		
		for (int i = 0; i < m.length; i++) {
			int count = 0;
			for (int j = 0; j < m.length; j++) {
				if (m[j] == m[i]) count++;
			}
			if (count > maxCount) {
				maxCount = count;
				maxValue = m[i];
			}
		}
		return maxValue;
	}
	
	public static void main(String[] args) {
		
		int N = 20;
		// mean
		double[] A = new double[N];
		
		for (int i = 0; i < N; i++) {
			A[i] = (int) (Math.random()* 100);
			System.out.print(A[i] + " ");
		}
		
		System.out.println();
		System.out.println("mean = " + myMean(A));
		System.out.println("Sorting...");
		double[] B = new double[N];
		for (int i = 0; i < A.length; i++) {
			B[i] = A[i];
		}
		boolean swapped;
		
		do {
			swapped = false;
			for (int i = 0; i < B.length - 1; i++) {
				if (B[i] > B[i + 1]) {
					double temp = B[i];
					B[i] = B[i + 1];
					B[i + 1] = temp;
					swapped = true;
				}
			}
		} while (swapped);
		
		for (int i = 0; i < B.length; i ++) {
			System.out.print(B[i] + " ");
		}
		
		System.out.println();
		System.out.println("median = " + myMedian(B));
		
//		double[] C = new double[] {2.0, 3.0, 4.0, 4.0, 4.0, 3.0, 3.0, 3.0};
		
		System.out.println("mode = " + myMode(B));
	}
		
	


}
