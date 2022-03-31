package in.sourashis.school.class9.help;

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
public class Special2DigitNumber {

	/**
	 * main() method
	 * @param args Command line arguments
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a two-digit number: ");
		int n = sc.nextInt();
		sc.close();

		if (n < 10 || n > 99) {
			System.out.println("You must enter a two-digit number");
			return;
		}
		int sum = n%10 + n/10, product = (n%10) * (n/10);
		System.out.println(sum + product == n? "Special 2-digit number": "Not a special 2-digit number");
	}
}
