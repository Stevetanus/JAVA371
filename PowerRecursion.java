package Demo;

public class PowerRecursion {

	static int power(int a, int n) {
		if(n == 0) {
		    return 1;
		  }
		if ((n & 1) == 0) {
			return power(a * a, n / 2);
		} else {
			return a * power(a * a, n / 2);
		}
		
	}
	
	static double negPower(int n) {
		if (n != 0) {
			return 1 / (double) 2 * negPower(n + 1);
		} else {
			return 1;
		}
	}
	
	static int naivePower(int n) {
		int answer = 1;
		while(n >= 1) {
			answer *= 2;
			n--;
		}
		return answer;
	}
	
	static int loopPower(int n) {
		int answer = 1;
		for (int i = 0; i < n; i++) {
			answer *= 2;
		}
		return answer;
	}
	
	public static void main(String[] args) {

		System.out.println(power(2,10));
		System.out.println(negPower(-2));
		System.out.println(naivePower(10));
		System.out.println(loopPower(10));
		
	}

}
