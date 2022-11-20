package Demo;

public class ArrayDemo {

	public static void main(String[] args) {
		
		int N = 5;
		int[] A = new int [N];
		for (int i = 0; i < A.length; i++) {
			A[i] = (int) (Math.random() * 10);
		}
		for (int i = 0; i < A.length; i++) {
			System.out.printf("%d ", A[i]);
		}
		System.out.println();
		
		int max = A[0];
		int sum = A[0];
		for (int i = 1; i < A.length; i++) {
			sum += A[i];
			if (A[i] > max) {
				max = A[i];
			}
		}
		System.out.println("MAX = " + max);
		System.out.println("Sum = " + sum);
		for (int item : A) {
			sum += item;
		}
		System.out.println("sum + sum =" + sum);
		
		String[] letters = {"A", "B", "C", "D", "E"};
		for (String letter : letters) {
			System.out.print(letter);
		}
		
		
	}

}
