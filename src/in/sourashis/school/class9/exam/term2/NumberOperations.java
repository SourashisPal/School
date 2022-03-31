package in.sourashis.school.class9.exam.term2;

import java.util.Scanner;

/**
 * Write a menu driver program to accept a number from the user and do the following:<br>
 * 1. Test for palindrome no. (by reversing the digits the no. does not change e.g. 121).<br>
 * 2. Find the sum of first and last digit? Hint:- use switch-case.<br>
 * E.g - <code>2383</code><br>
 * Output - <code>Sum of first and last digit is = 5</code><br>
 * @author Sourashis Pal
 */
public class NumberOperations {

	/**
	 * main() method
	 * @param args Command-line arguments
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("1. Test for palindrome no.\n" +
				"2. Find the sum of first and last digit\n" +
				"Enter choice: ");
		int choice = sc.nextInt();
		if (choice != 1 && choice != 2) {
			System.out.println("\nInvalid Choice");
			return;
		}
		System.out.print("\nEnter the number: ");
		int n = sc.nextInt();
		switch (choice) {
			case 1:
				int reverse = 0, copy = n;
				while (n != 0) {
					reverse = reverse*10 + n%10;
					n /= 10;
				}
				System.out.println(copy == reverse? "Palindrome": "Not Palindrome");
				break;
			case 2:
				copy = n;
				int digits = 0;
				while (n != 0) {
					digits++;
					n /= 10;
				}
				int first = copy / (int) Math.pow(10, digits-1);
				int last = copy % 10;
				System.out.println("Sum of first and last digits = " + (first + last));
		}
		sc.close();
	}
}