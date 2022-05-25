package in.sourashis.school.class10.holiday;

import java.util.Scanner;

/**
 * Write a program to input 10 number into an integer array and find the frequency of each number present in it.
 * @author Sourashis Pal
 */
public class Frequencies {

	/**
	 * main() method
	 * @param args Command-line arguments
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 10 numbers: ");
		int[] arr = new int[10];
		for (int i = 0; i < 10; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();

		loop: for (int i = 0; i < 10; i++) {
			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j]) {
					continue loop;
				}
			}
			int frequency = 1;
			for (int j = i+1; j < 10; j++) {
				if (arr[i] == arr[j]) {
					frequency++;
				}
			}
			System.out.println("Frequency of " + arr[i] + ": " + frequency);
		}
	}
}
