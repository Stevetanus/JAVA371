package Demo;

public class PointDemo {

	public static void main(String[] args) {

		Point p1 = new Point(4,6); // put in heap and put back to a variable called p1.
		// p1參考一個point

		p1.setX(3);
		p1.setY(4);
		
		Point p2 = new Point(7,8);
//		p2.setX(10);
//		p2.setY(20);		
		
		System.out.printf("p1 = (%.2f, %.2f)\n", p1.getX(), p1.getY());
		System.out.printf("p2 = (%.2f, %.2f)\n", p2.getX(), p2.getY());
	}

}
