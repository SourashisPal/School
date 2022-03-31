package in.sourashis.school.class9.help;

import java.util.Scanner;

/**
 * Enter a number and calculate the summation of the power of its respective digit and check whether it is equal or not<br>
 * E.g. 135<br>
 * 1<sup>1</sup> + 3<sup>2</sup> + 5<sup>3</sup> = 1 + 9 + 125 = 135<br>
 * Equal
 * @author Sourashis Pal
 */
public class DigitPoweredSummation {

	/**
	 * main() method
	 * @param args Command-line arguments
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = sc.nextInt();
		sc.close();

		int copy = n, sum = 0, digits = 0;
		for (; n != 0; n /= 10) {
			digits++;
		}
		for (n = copy; n != 0; n /= 10, digits--) {
			sum += (int) Math.pow(n%10, digits);
		}
		System.out.println(copy == sum? "Equal": "Not equal");
	}
}
