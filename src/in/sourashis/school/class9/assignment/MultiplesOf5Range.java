package in.sourashis.school.class9.assignment;

import java.util.Scanner;

/**
 * Write a program to input two numbers and print all the multiples of 5 from lower value to upper value.
 * @author Sourashis Pal
 */
public class MultiplesOf5Range {

	/**
	 * main() method
	 * @param args Command-line arguments
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter lower value: ");
		int lower = sc.nextInt();
		System.out.print("Enter upper value: ");
		int upper = sc.nextInt();
		sc.close();

		System.out.println("\nMultiples of 5:-");
		for (int i = lower; i <= upper; i++) {
			if (i % 5 == 0) {
				System.out.println(i);
			}
		}
	}
}
