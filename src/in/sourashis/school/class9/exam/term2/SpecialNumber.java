package in.sourashis.school.class9.exam.term2;

import java.util.Scanner;

/**
 * A special two-digit number is such that when the sum of its digits is added to the product of its digits, the result is equal to the original two-digit number.<br>
 * <br>
 * Example: Consider the number 59.
 * Sum of digits = 5 + 9 = 14
 * Product of digits = 5 * 9 = 49
 * Total of the sum of digits and product of digits = 14 + 49 = 64<br>
 * <br>
 * Write a program to accept a two-digit number. Add the sum of its digits to the product of its digits.
 * If the value is equal to the number input, display the message "Special 2-digit number" otherwise, display the message "Not a special two-digit number"
 * <br>
 * @author Sourashis Pal
 */
public class SpecialNumber {

	/**
	 * main() method
	 * @param args Command-line arguments
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number to check: ");
		int n = sc.nextInt();
		sc.close();

		int copy = n, digits = 0;
		while (copy != 0) {
			digits++;
			copy /= 10;
		}
		if (digits != 2) {
			System.out.println("Not a 2-digit number");
			return;
		}
		int sum = n%10 + n/10;
		int product = (n%10) * (n/10);
		if (sum + product == n) {
			System.out.println("Special 2 - digit number");
		} else {
			System.out.println("Not a special two-digit number");
		}
	}
}