package in.sourashis.school.class9.assignment;

import java.util.Scanner;

/**
 * Write a program to input 2 integers and check whether both the numbers are multiples of 7 or not.
 * @author Sourashis Pal
 */
public class Check7Multiple {

	/**
     * main method()
	 * @param args Command line arguments
     */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 2 integers: ");
		int a = sc.nextInt(), b = sc.nextInt();
		sc.close();

		if (a % 7 == 0) {
			if (b % 7 == 0) {
				System.out.println("Both are multiples of 7");
			} else {
				System.out.println("Only " + a + " is multiple of 7");
			}
		} else if (b % 7 == 0) {
			System.out.println("Only " + b + " is multiple of 7");
		} else {
			System.out.println("Neither is multiple of 7");
		}
	}
}
