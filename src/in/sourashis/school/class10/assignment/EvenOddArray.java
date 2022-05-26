package in.sourashis.school.class10.assignment;

import java.util.Scanner;

/**
 * Write a program in Java to store 20 numbers in a single dimensional array.
 * Calculate and display the sum of all even numbers and odd numbers separately
 * @author Sourashis Pal
 */
public class EvenOddArray {

	/**
	 * main() method
	 * @param args Command-line arguments
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[20];
		System.out.print("Enter 20 numbers: ");
		for (int i = 0; i < 20; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();

		int evenSum = 0, oddSum = 0;
		for (int i = 0; i < 20; i++) {
			if (arr[i] % 2 == 0) {
				evenSum += arr[i];
			} else {
				oddSum += arr[i];
			}
		}
		System.out.println("Sum of even numbers = " + evenSum);
		System.out.println("Sum of odd numbers = " + oddSum);
	}
}
