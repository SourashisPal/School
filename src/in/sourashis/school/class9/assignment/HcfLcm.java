package in.sourashis.school.class9.assignment;

import java.util.Scanner;

/**
 * Write a program to enter two numbers to find HCF and LCM of two numbers.
 * @author Sourashis Pal
 */
public class HcfLcm {

	/**
	 * main() method
	 * @param args Command-line arguments
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter two numbers: ");
		int a = sc.nextInt(), b = sc.nextInt();
		sc.close();

		int min = Math.min(a, b);
		int hcf = 1;
		for (int i = 2; i <= min/2; i++) {
			if (a % i == 0 && b % i == 0) {
				hcf = i;
			}
		}
		int lcm = a * b / hcf;

		System.out.println("HCF = " + hcf);
		System.out.println("LCM = " + lcm);
	}
}
