package in.sourashis.school.class10.assignment;

import java.util.Scanner;

/**
 * Enter a number and check whether it is Krishnamurthy or not.<br>
 * E.g. - 145<br>
 * <code>1! + 4! + 5! = 1 + 24 + 120 = 145</code><br>
 * So, 145 is Krishnamurthy number.
 * @author Sourashis Pal
 */
public class Krishnamurthy {

	/**
	 * main() method.
	 * @param args Command-line arguments.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = sc.nextInt();
		sc.close();

		int copy = n, sum = 0;
		while (n > 0) {
			int digit = n % 10, factorial = 1;
			for (int i = 2; i <= digit; i++) {
				factorial *= i;
			}
			sum += factorial;
			n /= 10;
		}
		System.out.println(copy == sum ? "Krishnamurthy number" : "Not Krishnamurthy number");
	}
}
