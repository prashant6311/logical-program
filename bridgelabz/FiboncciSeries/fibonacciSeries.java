package bridgelabz.FiboncciSeries;

import java.util.Scanner;

public class fibonacciSeries {

	public static void main(String[] args) {
		int term, a = 0, b = 1, c;
		Scanner f = new Scanner(System.in);
		System.out.println("Enter a term");
		term = f.nextInt();

		for (int i = 1; i <= term; i++) {
			System.out.println(a);
			c = a + b;
			a = b;
			b = c;
		}

	}

}
