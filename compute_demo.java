package Demo;

import java.util.Scanner;

public class compute_demo {
	
	public static void main(String[] args) {
		
		// Input
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your name?");
		String name = input.nextLine();
		
		System.out.println("Enter your height?");
		double height = input.nextDouble();
		
		System.out.println("Enter your weight?");
		double weight = input.nextDouble();
		
		double bmi = 10000 * weight/ height / height;
		
		System.out.println(name + " (" + bmi + ") ");
		input.close();
	}
}
