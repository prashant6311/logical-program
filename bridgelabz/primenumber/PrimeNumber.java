package bridgelabz.primenumber;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num1 = sc.nextInt();

		if (num1 % 2 == 0) {
			System.out.println("is Not Prime No:" + num1);
		} else {
			System.out.println("is Prime No:" + num1);
		}
	}

}
