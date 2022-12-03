package Demo;

public class PiDemo {

	public static void main(String[] args) {
		
		for (String elem: args) {
			System.out.println(elem);
		}
		// (1) 10!
		int ans1 = 1;
		for (int x = 0; x < 10; x++) {
			ans1 = ans1 * x;
		}
		System.out.println(ans1);
		
		// (2) 2 ^ 10 = 2 x 2 ... (7 times) ... x 2 = 1024
		double ans2 = 1;
		for (int i = 1; i <= 10; i++) {
			ans2 = ans2 * 2;
		}
		System.out.println(ans2);
		
		double ans3 = 0;
		for (int i = 0; i <= 10000; i++) {
			ans3 += Math.pow(-1, i) / (2 * i + 1);
		}
		ans3 = 4 * ans3;
		System.out.println(ans3);
		
	}

}
