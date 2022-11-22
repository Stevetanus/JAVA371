// Lab 2-1 & 2-2
package Demo;

import java.util.ArrayList;
import java.util.Scanner;

public class ContagionControl2 {

	public static void main(String[] args) {
		System.out.println("Enter the numbers of population?");
		
		Scanner input = new Scanner (System.in);
		int N = input.nextInt();
//		int N = 5;
		ArrayList<Integer> A = new ArrayList<Integer>();
		
		for (int i = 0; i < N; i++) {
			A.add(i);
		}

		System.out.printf("%9s", "Id");
		for (int element: A) {
			System.out.printf("%3d", element);
		}
		
		ArrayList<Integer> B = new ArrayList<Integer>();
		
		// Shuffle
		for (int i = 0; i < N; i++) {
			int j = (int) (Math.random() * (N - i)); // Countdown from N - 1.
			B.add(A.get(j));
			A.remove(j);
		}
		
		for (int i = 0; i < N; i++) {
			A.add(i);
		}
	
		System.out.println();
		System.out.printf("%9s", "Contactee");
		
		for (int element: B) {
			System.out.printf("%3d", element);
		}
	
		System.out.println();

		int group = 0;
		ArrayList<Integer> C = new ArrayList<Integer>();
		
		System.out.println("-----------------------------------------------");
		
		while(A.size() > 0) {
			int initial = A.get(0);
			int curr = initial;
			C = new ArrayList<Integer>();
			group++;
			
			
			do {
				C.add(curr);
				curr = B.get(curr);
			} while (curr != initial);
			
			System.out.print("Group" + group + ": ");
			for (int elem : C) {
				System.out.printf("%3s", elem);
			}
			
			for (int elem : C) {
				A.remove(Integer.valueOf(elem));
			}
			System.out.println();
		}
		
		System.out.println("Number of groups = " + group);
		input.close();
		
	}

}
