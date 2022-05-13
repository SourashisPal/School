package in.sourashis.school.class10.assignment;

import java.util.Scanner;

/**
 * Enter two number and find their HCF and LCM.
 * @author Sourashis Pal
 */
public class HcfLcm {

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
		System.out.println("HCF = " + hcf);
		System.out.println("LCM = " + a * b / hcf);
	}
}
