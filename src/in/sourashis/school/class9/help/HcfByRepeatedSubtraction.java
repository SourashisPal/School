package in.sourashis.school.class9.help;

import java.util.Scanner;

/**
 * Enter a number and calculate its HCF by repeated subtraction.
 */
public class HcfByRepeatedSubtraction {

	/**
	 * main() method
	 * @param args Command-line arguments
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter two numbers: ");
		int a = sc.nextInt(), b = sc.nextInt();
		sc.close();

		while (a != 0) {
			if (a >= b) {
				a -= b;
			} else {
				b -= a;
			}
		}
		System.out.println("HCF = " + b);
	}
}
