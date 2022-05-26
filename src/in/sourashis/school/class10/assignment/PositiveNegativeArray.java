package in.sourashis.school.class10.assignment;

import java.util.Scanner;

/**
 * Write a program in Java to store 10 numbers in a single dimensional array.
 * Display all the negative numbers followed by the positive numbers without changing the order of the numbers.
 * @author Sourashis Pal
 */
public class PositiveNegativeArray {

	/**
	 * main() method
	 * @param args Command-line arguments
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		System.out.print("Enter 10 numbers: ");
		for (int i = 0; i < 10; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();

		System.out.print("Numbers: ");
		for (int i = 0; i < 10; i++) {
			if (arr[i] < 0) {
				System.out.print(arr[i] + " ");
			}
		}
		for (int i = 0; i < 10; i++) {
			if (arr[i] > 0) {
				System.out.print(arr[i] + " ");
			}
		}
	}
}
