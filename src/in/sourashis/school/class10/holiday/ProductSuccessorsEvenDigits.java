package in.sourashis.school.class10.holiday;

import java.util.Scanner;

/**
 * Write a program to input a number. Display the product of the successors of even digits of the number entered by the user
 * @author Sourashis Pal
 */
public class ProductSuccessorsEvenDigits {

	/**
	 * main() method
	 * @param args Command-line arguments
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int n = sc.nextInt();
		sc.close();

		int product = 1, copy = n;
		boolean hasEvenDigit = false;
		for (; n != 0; n /= 10) {
			int digit = n % 10;
			if (digit % 2 == 0) {
				product *= digit + 1;
				hasEvenDigit = true;
			}
		}
		if (hasEvenDigit) {
			System.out.println("Product of even digits successors is " + product);
		} else {
			System.out.println("No even digits in " + copy);
		}
	}
}
