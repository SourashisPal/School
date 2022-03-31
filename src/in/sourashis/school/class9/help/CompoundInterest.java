package in.sourashis.school.class9.help;

import java.util.Scanner;

/**
 * Write a program to create a method to calculate the compound interest on a certain sum of money
 * @author Sourashis Pal
 */
public class CompoundInterest {

	/**
	 * Calculates compound interest
	 * @param principal Sum of money
	 * @param rate Rate of interest
	 * @param time Time
	 * @return Compound interest
	 */
	private static double compoundInterest(double principal, double rate, double time) {
		return principal * Math.pow(1 + rate/100, time) - principal;
	}

	/**
	 * main() method
	 * @param args Command-line arguments
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter principal: ");
		double principal = sc.nextDouble();
		System.out.print("Enter rate of interest: ");
		double rate = sc.nextDouble();
		System.out.print("Enter time: ");
		int time = sc.nextInt();
		sc.close();

		System.out.printf("Compound Interest = %.2f\n", compoundInterest(principal, rate, time));
	}
}
