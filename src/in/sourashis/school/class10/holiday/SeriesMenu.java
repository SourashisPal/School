package in.sourashis.school.class10.holiday;

import java.util.Scanner;

/**
 * Print the following series as per the user's choice:-<br>
 * 1. S = 1 + (1+2) + (1+2+3) + ... + (1+2+3+...+n)<br>
 * 2. S = a - a^3 + a^5 - a^7 + ... to n<br>
 * 3. 1, 12, 123, 1234,<br>
 * 4, 1, 11, 111, 1111,<br>
 * S = (1/a) + (2/a^2) + (3/a^3) + ... to n
 * @author Sourashis Pal
 */
public class SeriesMenu {

	/**
	 * main() method
	 * @param args Command-line arguments
	 */
	public static void main(String[] args) {
		System.out.print("1. S = 1 + (1+2) + (1+2+3) + ... + (1+2+3+...+n)\n" +
				"2. S = a - a^3 + a^5 - a^7 + ... to n\n" +
				"3. 1, 12, 123, 1234,\n" +
				"4. 1, 11, 111, 1111,\n" +
				"5. S = (1/a) + (2/a^2) + (3/a^3) + ... to n\n" +
				"Enter choice: ");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		System.out.println();

		switch (choice) {
			case 1: {
				System.out.print("Enter n: ");
				int n = sc.nextInt(), s = 0;
				for (int i = 1, sum = 0; i <= n; i++) {
					s += sum += i;
				}
				System.out.println("S = " + s);
				break;
			}
			case 2: {
				System.out.print("Enter n: ");
				int n = sc.nextInt();
				System.out.print("Enter a: ");
				int a = sc.nextInt();
				double s = 0;
				for (int p = 1, sign = 1; p <= n; p += 2, sign *= -1) {
					s += sign * Math.pow(a, p);
				}
				System.out.println("S = " + s);
				break;
			}
			case 3: {
				for (int i = 1, term = 0; i <= 4; i++) {
					System.out.print((term = term * 10 + i) + ", ");
				}
				System.out.println();
				break;
			}
			case 4: {
				for (int i = 1, term = 0; i <= 4; i++) {
					System.out.print((term = term * 10 + 1) + ", ");
				}
				System.out.println();
				break;
			}
			case 5: {
				System.out.print("Enter n: ");
				int n = sc.nextInt();
				System.out.print("Enter a: ");
				int a = sc.nextInt();
				double s = 0;
				for (int p = 1; p <= n; p++) {
					s += p / Math.pow(a, p);
				}
				System.out.println("S = " + s);
				break;
			}
			default: {
				System.out.println("Invalid choice");
			}
		}
	}
}
