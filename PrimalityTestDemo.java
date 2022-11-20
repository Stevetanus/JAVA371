package Demo;

public class PrimalityTestDemo {

	public static void main(String[] args) {
		
		int x = 21;
		
		for (int i = 2; i < x; i++) {
			System.out.println(i);
			
			if (x % i == 0) {
				System.out.println("This is not a prime.");
				break;
			}
		}

	}

}
