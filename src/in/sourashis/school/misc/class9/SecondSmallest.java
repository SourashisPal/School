package in.sourashis.school.misc.class9;

import java.util.Scanner;

/**
 * Write a program to input three unequal numbers and display the second-smallest number<br>
 * Sample Input - <code>65 41 98</code><br>
 * Sample Output - <code>65</code><br>
 * Using Scanner class and nested if-else
 * @author Sourashis Pal
 */
public class SecondSmallest {

	/**
	 * main() method
	 * @param args Command-line arguments
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter three numbers: ");
		int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
		sc.close();

		int secondSmallest;
		if (a > b && a < c || a < b && a > c) {
			secondSmallest = a;
		} else if (b > a && b < c || b < a && b > c) {
			secondSmallest = b;
		} else {
			secondSmallest = c;
		}
		System.out.println("Second smallest = " + secondSmallest);
	}
}
