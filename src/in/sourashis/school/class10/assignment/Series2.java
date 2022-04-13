package in.sourashis.school.class10.assignment;

import java.util.Scanner;

/**
 * Write a program to print the sum of the following series:-<br>
 * <code>S = 2!/1 + 3!/2 + 4!/3 + ... n!/(n-1)</code><br>
 * Solve using nested loop
 * @author Sourashis Pal
 */
public class Series2 {

	/**
	 * main() method
	 * @param args Command-line arguments
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of n: ");
		int n = sc.nextInt();
		sc.close();

		double sum = 0;
		for (int i = 2; i <= n; i++) {
			double factorial = 1;
			for (int j = 1; j <= i; j++) {
				factorial *= j;
			}
			sum += factorial / (i - 1);
		}
		System.out.printf("Sum of the series = %.0f\n", sum);
	}
}
