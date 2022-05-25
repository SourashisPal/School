package in.sourashis.school.class10.holiday;

import java.util.Scanner;

/**
 * Write a program to input a number and check and print whether it is a Pronic number or not.
 * Pronic number is the number which is the product of two consecutive integers.
 * @author Sourashis Pal
 */
public class PronicNumber {

	/**
	 * main() method
	 * @param args Command-line arguments
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number to check: ");
		int n = sc.nextInt();
		sc.close();

		int i = 1;
		for (; i * (i+1) < n; i++);
		System.out.println(i * (i+1) == n? n + " is a pronic number" : n + " is not a pronic number");
	}
}
