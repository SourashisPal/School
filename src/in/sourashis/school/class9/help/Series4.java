package in.sourashis.school.class9.help;

import java.util.Scanner;

/**
 * Print the following series:-<br>
 * <code>3 6 9 12 ... n terms</code>
 * @author Sourashis Pal
 */
public class Series4 {

	/**
	 * main() method
	 * @param args Command-line arguments
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of n: ");
		int n = sc.nextInt();
		sc.close();

		for (int i = 1; i <= n; i++) {
			System.out.println(3 * i);
		}
	}
}