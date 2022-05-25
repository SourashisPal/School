package in.sourashis.school.class10.holiday;

import java.util.Scanner;

/**
 * Write a program to input a number and print the following pattern:-<br>
 * <code>
 *     &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;1<br>
 *     &nbsp;&nbsp;&nbsp;&nbsp;1 2 1<br>
 *     &nbsp;&nbsp;1 2 3 2 1<br>
 *     1 2 3 4 3 2 1<br>
 *     &nbsp;&nbsp;1 2 3 2 1<br>
 *     &nbsp;&nbsp;&nbsp;&nbsp;1 2 1<br>
 *     &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;1
 * </code>
 * @author Sourashis Pal
 */
public class Pattern {

	/**
	 * main() method
	 * @param args Command-line arguments
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter n: ");
		int n = sc.nextInt();
		sc.close();

		for (int i = 1; i <= n; i++) {
			for (int j = 0; j < n-i; j++) {
				System.out.print("  ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			for (int j = i-1; j > 0; j--) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		for (int i = n-1; i > 0; i--) {
			for (int j = 0; j < n-i; j++) {
				System.out.print("  ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			for (int j = i-1; j > 0; j--) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		System.out.println();
	}
}
