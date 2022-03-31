package in.sourashis.school.class9.help;

import java.util.Scanner;

/**
 * Print the following:-<br>
 * 1 4 9 16 25 ... n terms
 * @author Sourashis Pal
 */
public class Series3 {

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
			System.out.println(i * i);
		}
	}
}