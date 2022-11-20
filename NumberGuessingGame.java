package Demo;

import java.util.Scanner;

public class NumberGuessingGame {
	
	public static void main(String[] args) {
		int min = 0;
		int max = 99;
		int guess;
		int random100 = (int) (Math.random() * 100);
//		int random100 = 94; // test case
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Take a guess! ("+ min + ", " + max + ")?");

		guess = input.nextInt();
		
		while(guess != random100) {
			if (guess > max) {
				System.out.println("Bigger than the maximum.");
			}
			if (guess < min) {
				System.out.println("Smaller than the minimum.");
			}
			if (guess <= max && guess > random100) {
				max = guess - 1;
				System.out.println("In the range.");
			}		
			if (guess >= min && guess < random100) {
				min = guess + 1;
				System.out.println("In the range.");
			}
			if (min == max) break;
			System.out.println("Take a guess! (" + min + ", " + max + ")?");
			guess = input.nextInt();
		}
		
		if (min == max) {
			System.out.println("GG! Answer is " + random100 + ".");
			} else {
				System.out.println("Bingo! " + random100 + "!");
			}
		
		input.close();
	}
}
