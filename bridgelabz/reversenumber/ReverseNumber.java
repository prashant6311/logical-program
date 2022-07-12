package bridgelabz.reversenumber;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		int number = 0, reverse = 0;
		System.out.println("Enter a number you want reverse: ");
		Scanner sc = new Scanner(System.in);
		int number1 = sc.nextInt();
		while (number1 != 0) {
			int remainder = number1 % 10;
			reverse = reverse * 10 + remainder;
			number1 = number1 / 10;
		}
		System.out.println("The reverse of the given number is: " + reverse);

	}

}
