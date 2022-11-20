package Demo;

import java.util.Scanner;

public class CashierDemo {

	public static void main(String[] args) {
		
//		int price = 0;
		int total = 0;		
		Scanner input = new Scanner(System.in);
		/*
		System.out.println("Enter price?");
		price = input.nextInt();
		
		while (price > 0){
			total += price;
			System.out.println("Enter price?");
			price = input.nextInt();
		}
		*/
		
//		do {
//			total += price;
//			System.out.println("Enter price?");
//			price = input.nextInt();
//		} while (price > 0);
		
		System.out.println("Total = " + total);
		System.out.println((int) (Math.random() * 100 +1));
		
		int multiSum = 1;
		
		for (int i = 1; i <= 10; i++) {
			multiSum *= i;
		}
		System.out.println(multiSum);
		System.out.println(Math.pow(2, 10));
		input.close();

	}

}
