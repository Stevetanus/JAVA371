package Demo;

public class three_random_max {

	public static void main(String[] args) {
		int x = (int) (Math.random() * 101) - 50;
		int y = (int) (Math.random() * 101) - 50;
		int z = (int) (Math.random() * 101) - 50;
		
		int max = x;
		if (max < y) max = y;
		if (max < z) max = z;
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		System.out.println("Max = " + max);
	}

}
