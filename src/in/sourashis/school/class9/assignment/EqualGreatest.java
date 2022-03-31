package in.sourashis.school.class9.assignment;

import java.util.Scanner;

/**
 * Write a program to input three numbers and check whether they are equal or not.<br>
 * If they are unequal numbers then display the greatest among them.<br>
 * Otherwise, display the message "All then numbers are equal".<br>
 * <br>
 * Sample Input: <code>34, 87, 61</code><br>
 * Sample Output: Greatest number: <code>87</code><br>
 * <br>
 * Sample Input: <code>81, 81, 81</code><br>
 * Sample Output: <code>All the numbers are equal</code><br>
 * <br>
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
