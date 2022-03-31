package in.sourashis.school.class9.help;

import java.util.Scanner;

/**
 * Print the value of S, where<br>
 * <code>S = 1/a + 2/a^2 + 3/a^3 + .... to n terms</code>
 * @author Sourashis Pal
 */
public class Series5 {

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
		for (int i = 1; i <= n; i++) {
			s += i / Math.pow(a, i);
		}
		System.out.println("Sum of the series = " + s);
	}
}
