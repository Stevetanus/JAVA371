package Demo;

public class MonteCarloSimulation {

	public static void main(String[] args) {
		
		int N = 1000000;
		int M = 0;
		
		for (int i = 1; i <= N; i++) {
			
			double x = Math.random();
			double y = Math.random();
			
			if (x * x + y * y < 1) M++;
			
		}
		
		System.out.println("pi ~ " + 4.0 * M / N);

	}

}
