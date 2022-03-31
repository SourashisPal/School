package in.sourashis.school.class9.help;

import java.util.Scanner;

/**
 * Enter a number and check whether it is prime or not.
 * If it is not prime print the next prime nubmer
 * @author Sourashis Pal
 */
public class Prime {

	/**
	 * main() method
	 * @param args Command-line arguments
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number to check: ");
		int n = sc.nextInt();
		sc.close();

		int count = 0;
		for (int i = 1; i <= n/2; i++) {
			if (n % i == 0) {
				count++;
			}
		}
		if (count == 1) {
			System.out.println(n + " is prime");
		} else {
			System.out.println(n + " is not prime");
			loop: for (n++; ; n++) {
				if (n <= 1) {
					continue;
				}
				for (int i = 2; i <= n/2; i++) {
					if (n % i == 0) {
						continue loop;
					}
				}
				System.out.println("Next prime number = " + n);
				break;
			}
		}
	}
}
