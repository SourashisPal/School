package in.sourashis.school.class9.help;

import java.util.Scanner;

/**
 * Write a program to input a number.
 * Display the product of the successor of even digits of the number entered by the user<br>
 * Input: <code>2745</code><br>
 * Output: <code>15</code>
 * @author Sourashis Pal
 */
public class EvenDigitSuccessorProduct {

	/**
	 * main() method
	 * @param args Command-line arguments
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: " );
		int n = sc.nextInt();
		sc.close();

		int product = 1;
		for (; n != 0; n /= 10) {
			int d = n % 10;
			if (d % 2 == 0) {
				product *= d + 1;
			}
		}
		System.out.println("Product of the successors of even digits = " + product);
	}
}
