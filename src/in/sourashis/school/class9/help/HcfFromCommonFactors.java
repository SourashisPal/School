package in.sourashis.school.class9.help;

import java.util.Scanner;

/**
 * Enter a number and calculate its HCF from common factors.
 * @author Sourashis Pal
 */
public class HcfFromCommonFactors {

	/**
	 * main() method
	 * @param args Command-line arguments
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter two numbers: ");
		int a = sc.nextInt(), b = sc.nextInt();
		sc.close();

		int hcf = 1, min = Math.min(a, b);
		for (int i = 2; i <= min/2; i++) {
			if (a % i == 0 && b % i == 0) {
				hcf = i;
			}
		}
		System.out.println("HCF = " + hcf);
	}
}
