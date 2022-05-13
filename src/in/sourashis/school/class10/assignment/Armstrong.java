package in.sourashis.school.class10.assignment;

import java.util.Scanner;

/**
 * Enter a number and check whether it is Armstrong or not.
 * @author Sourashis Pal
 */
public class Armstrong {

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
		for (; n != 0; n /= 10) {
			int digit = n % 10;
			sum += digit * digit * digit;
		}
		System.out.println(copy == sum? "Armstrong number": "Not Armstrong number");
	}
}
