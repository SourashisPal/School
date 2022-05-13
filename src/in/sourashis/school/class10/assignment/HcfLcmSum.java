package in.sourashis.school.class10.assignment;

import java.util.Scanner;

/**
 * Enter two number and find the sum of their HCF and LCM.
 * @author Sourashis Pal
 */
public class HcfLcmSum {

	/**
	 * main() method.
	 * @param args Command-line arguments
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 2 numbers: ");
		int a = sc.nextInt(), b = sc.nextInt();
		sc.close();

		int hcf = 1, min = Math.min(a, b);
		for (int i = 2; i <= min; i++) {
			if (a % i == 0 && b % i == 0) {
				hcf = i;
			}
		}
		System.out.println("Sum of HCF and LCM = " + (hcf + a * b / hcf));
	}
}
