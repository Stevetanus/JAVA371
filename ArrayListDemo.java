package Demo;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] A = new int [3];
		A[0] = 100;
		A[1] = 200;
		A[2] = 300;
		System.out.println(A);
		
		for (int item : A) {
			System.out.printf("%4d", item);
		}
		
		System.out.println();
		
		ArrayList<Integer> B = new ArrayList<>();
		B.add(100);
		B.add(200);
		B.add(300);
		System.out.println(B);
	}

}
