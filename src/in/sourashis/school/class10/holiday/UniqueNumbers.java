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
		int[] a = new int[10], b = new int[10];
		int count = 0;
		System.out.print("Enter 10 numberse: ");
		for (int i = 0; i < 10; i++) {
			a[i] = sc.nextInt();
		}
		loop: for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				if (i != j && a[i] == a[j]) {
					continue loop;
				}
			}
			b[count++] = a[i];
		}

		System.out.print("Unique numbers: ");
		for (int i = 0; i < count; i++) {
			System.out.print(b[i] + " ");
		}
		System.out.println();
	}
}
