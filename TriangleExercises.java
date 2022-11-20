package Demo;

public class TriangleExercises {

	public static void main(String[] args) {
		System.out.println("Case(a)");
		for (int i = 1; i <= 5; i ++) {
			for (int j = 0; j < i; j ++) {
				System.out.printf("%-2s","*");
			}
			System.out.println();
		}
		System.out.println("Case(b)");
		for(int i = 5; i >= 1; i --) {
			for (int j = 0; j < i; j ++) {
				System.out.printf("%-2s", "*");
			}
			System.out.println();
		}
		System.out.println("Case(c)");
		//i for rows and j for columns      
		//row denotes the number of rows you want to print  
		int i, j, row = 5;       
		//Outer loop work for rows  
		for (i = 1; i <= row; i++) {  
		//inner loop work for space      
			for (j = 2 * (row - i); j > 0; j --)  {  
		//prints space between two stars      
				System.out.print(" ");   
				}   
		//inner loop for columns  
			for (j = 0; j < i; j++ )  {   
		//prints star      
				System.out.printf("%2s", "*");   
			}   
		//throws the cursor in a new line after printing each line  
			System.out.println();   
		}      
		
		System.out.println("Case(d)");
		int x, y, row2 = 5;
		for (x = 5; x > 0; x --) {
			for (y = 0; y < 2 * (row2 - x); y ++) {
				System.out.print(" ");
			}
			for (y = 0; y < x; y ++) {
				System.out.printf("%2s", "*");
			}
			System.out.println();
		}
	}

}
