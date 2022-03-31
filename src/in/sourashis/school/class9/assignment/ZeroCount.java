package in.sourashis.school.class9.assignment;

import java.util.Scanner;

/**
 * Enter a number and count the number of zeros in it
 * E.g. - 40306 -> 2
 * @author Sourashis Pal
 */
public class ZeroCount {

	/**
	 * main() method
	 * @param args Command-line arguments
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = sc.nextInt();
		sc.close();

		int zeroCount = 0;
		while (n > 0) {
			if (n % 10 == 0) zeroCount++;
			n /= 10;
		}
		System.out.println("No. of zeros = " + zeroCount);
	}
}
