package in.sourashis.school.misc.class9;

import java.util.Scanner;

/**
 * Print the value of S, where<br>
 * S = a - a^3 + a^5 - a^7 + .... n terms
 * @author Sourashis Pal
 */
public class Series6 {

	/**
	 * main() method
	 * @param args Command-line arguments
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter n: ");
		int n = sc.nextInt();
		System.out.print("Enter a: ");
		double a = sc.nextInt();
		sc.close();

		double s = 0;
		for (int i = 1, sign = 1; i <= n; i++, sign *= -1) {
			s += sign * Math.pow(a, i*2-1);
		}
		System.out.println("Sum of the series = " + s);
	}
}
