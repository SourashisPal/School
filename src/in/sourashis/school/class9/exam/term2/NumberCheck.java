package in.sourashis.school.class9.exam.term2;

import java.util.Scanner;

/**
 * Write a menu-driven program to accept a number from the user and check whether it is a Prime number or an Automorphic number.<br>
 * (a) Prime number: (A number is said to be prime, if it is only divisible by 1 and itself)<br>
 * <b>Example: </b>3, 5, 7, 11<br>
 * (b) Automorphic number: (Automorphic number is the number which is contained in the last digit(s) of its square.)<br>
 * <b>Example: </b>25 is an Automorphic number, as its square is 625 and 25 is present as the last two digits.
 * @author Sourashis Pal
 */
public class NumberCheck {

	/**
	 * main() method
	 * @param args Command-line arguments
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("1. Check for prime number\n" +
				"2. Check for automorphic number\n" +
				"Enter choice: ");
		int choice = sc.nextInt();
		if (choice != 1 && choice != 2) {
			System.out.println("\nInvalid Choice");
			return;
		}
		System.out.print("\nEnter number to check: ");
		int n = sc.nextInt();
		switch (choice) {
			case 1:
				if (n <= 1) {
					System.out.println("Not Prime");
					break;
				}
				for (int i = 2; i <= n/2; i++) {
					if (n % i == 0) {
						System.out.println("Not Prime");
						break;
					}
				}
				System.out.println("Prime");
				break;
			case 2:
				int copy = n, digits = 0;
				while (copy != 0) {
					digits++;
					copy /= 10;
				}
				if (n * n % Math.pow(10, digits) == n) {
					System.out.println("Automorphic number");
				} else {
					System.out.println("Not Automorphic number");
				}
		}
		sc.close();
	}
}