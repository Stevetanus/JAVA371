package Demo;

import java.util.Scanner;

public class TwosumDemo {

	public static void main(String[] args) {
		int x = (int) (Math.random() * 10);
		int y = (int) (Math.random() * 10);
		
		System.out.println(x + " + " + y + " = ?");
		
		Scanner input = new Scanner(System.in);
		int g = input.nextInt();
		
		if (g == x + y) {
			System.out.println("Correct.");
		} else {
			System.out.println("Wrong.");
			System.out.println("The answer is " + (x + y) + ".");
		}
		
		input.close();

	}

}
