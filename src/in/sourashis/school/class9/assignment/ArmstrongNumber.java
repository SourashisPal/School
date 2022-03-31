package in.sourashis.school.class9.assignment;

import java.util.Scanner;

/**
 * Enter a number and check whether it is an armstrong number or not<br>
 * An armstrong number is a number whose summation of cubes of each digit is equal to the number
 * E.g. 153 = 1<sup>3</sup> + 5<sup>3</sup> + 3<sup>3</sup> = 1 + 125 + 27 = 153
 * @author SourashisPal
 */
public class ArmstrongNumber {

	/**
	 * main() method
	 * @param args Command-line arguments
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = sc.nextInt();
		sc.close();

		int copy = n, sum = 0;
		while (n != 0) {
			int digit = n % 10;
			sum += digit * digit * digit;
			n /= 10;
		}
		System.out.println(copy == sum? "Armstrong number": "Not armstrong number");
	}
}
