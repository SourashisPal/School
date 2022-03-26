package in.sourashis.school.class9;

import java.util.Scanner;

/**
 * Write a program to input three numbers and check whether they are equal or not.
 * If they are unequal numbers then display the greatest among them.
 * Otherwise, display the message "All then numbers are equal".
 *
 * Sample Input: 34, 87, 61
 * Sample Output: Greatest number: 87
 *
 * Sample Input: 81,81, 81
 * Sample Output: All the numbers are equal
 *
 * @author Sourashis Pal
 */
public class EqualGreatest {

	/**
     * main method
     * @param args Command line arguments
     */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three numbers:-");
		int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
		sc.close();

		if (a == b && b == c) {
			System.out.println("All the numbers are equal");
		} else {
			System.out.println("Greatest number: " + Math.max(a, Math.max(b, c)));
		}
	}
}
