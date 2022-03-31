package in.sourashis.school.class9.assignment;

import java.util.Scanner;

/**
 * Enter a number and count the no. of even digits in it.<br>
 * E.g - 436 -&gt; 2
 * @author Sourashis Pal
 */
public class EvenDigitCount {

	/**
	 * main() method
	 * @param args Command-line arguments
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = sc.nextInt();
		sc.close();

		int evenCount = 0;
		while (n > 0) {
			if (n % 10 % 2 == 0) evenCount++;
			n /= 10;
		}
		System.out.println("No. of even digits = " + evenCount);
	}
}
