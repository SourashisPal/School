package in.sourashis.school.misc.class9;

import java.util.Scanner;

/**
 * Print the sum of the following series:-<br>
 * p/p^2 - p^2/p^3 + p^3/p^4 &#177 p^n/p^(n+1)
 * @author Sourashis Pal
 */
public class Series1 {

	/**
	 * main() method
	 * @param args Command-line arguments
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of p: ");
		double p = sc.nextDouble();
		System.out.print("Enter the value of n: ");
		int n = sc.nextInt();
		sc.close();
		double s = 0;
		for (int i = 1, sign = 1; i <= n; i++, sign *= -1) {
			s += sign * Math.pow(p, i) / Math.pow(p, i+1);
		}
		System.out.println("S = " + s);
	}
}