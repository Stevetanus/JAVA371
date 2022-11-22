// Lab 2 Contagion Control
package Demo;

import java.util.Scanner;

public class ContagionControl {

	public static void main(String[] args) {
		System.out.println("Enter the numbers of population?");
		
		Scanner input = new Scanner (System.in);
		int N = input.nextInt();
		int [] A = new int [N];
		for (int i = 1; i < A.length; i++) {
			A[i] = i;
		}
		
		System.out.printf("%9s", "Id");
		for (int element: A) {
			System.out.printf("%3d", element);
		}
		
		int [] contactee = new int[N];
		for (int i = 0; i < contactee.length; i++) {
			contactee[i] = i;
		}
		

		for (int i = 0; i < N - 1; i++) {
			int j = (int) (Math.random() * (N - i)) + i;
			int z = contactee[i];
			contactee[i] = contactee[j];
			contactee[j] = z;
			}
		
		System.out.println();
		System.out.printf("%9s", "Contactee");
		
		for (int element: contactee) {
			System.out.printf("%3d", element);
		}
		
		System.out.println();
		System.out.println("Enter who is the first diagnosed?");
		
		int initial = input.nextInt();
		int curr = initial;
		
		System.out.printf("%s", "Stay away from ");
		do {
			System.out.printf("%3d", curr);
			curr = contactee[curr];
		} while (curr != initial);
		
		input.close();
		
	}

}
