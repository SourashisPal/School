package in.sourashis.school.class10.holiday;

import java.util.Scanner;

/**
 * Write a program to input 10 numbers into an integer array and store only the unique numbers into another array and display it.
 * @author Sourashis Pal
 */
public class UniqueNumbers {

	/**
	 * main() method
	 * @param args Command-line arguments
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of elements: ");
		int n = sc.nextInt();

		int[] a = new int[n], b = new int[n];
		int count = 0;
		System.out.print("Enter the elements: ");
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		loop: for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i != j && a[i] == a[j]) {
					continue loop;
				}
			}
			b[count++] = a[i];
		}

		System.out.print("Unique elements: ");
		for (int i = 0; i < count; i++) {
			System.out.print(b[i] + " ");
		}
		System.out.println();
	}
}
