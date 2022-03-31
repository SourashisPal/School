package in.sourashis.school.class9.assignment;

import java.util.Scanner;

/**
 * Write a program to input an integer and check whether it is a 2-digit or a 3-digit number or not<br>
 * In case it is not a 2-digit or a 3-digit number a relevant message "Not 2 or 3-digit number" should be displayed.
 * @author Sourashis Pal
 */
public class DigitCheck {

	/**
     * main method
	 * @param args Command line arguments
     */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int n = Math.abs(sc.nextInt());
		sc.close();

		if (n >= 100 && n < 1000) {
			System.out.println("3-digit number");
		} else if (n >= 10 && n < 100) {
			System.out.println("2-digit number");
		} else {
			System.out.println("Not 2 or 3 digit");
		}
	}
}
