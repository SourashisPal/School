package in.sourashis.school.class10.holiday;

import java.util.Scanner;

/**
 * Write a program to enter two number and check whether they are co-prime or not.<br>
 * Two numbers are said to be co-prime if their HCF is 1.
 * @author Sourashis Pal
 */
public class CoPrime {

	/**
	 * main() method
	 * @param args Command-line arguments
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter two numbers: ");
		int a = sc.nextInt(), b = sc.nextInt();
		sc.close();

		int min = Math.min(a, b);
		for (int i = 2; i <= min/2; i++) {
			if (a % i == 0 && b % i == 0) {
				System.out.println(a + " and " + b + " are not co-prime");
				return;
			}
		}
		System.out.println(a + " and " + b + " are co-prime");
	}
}
