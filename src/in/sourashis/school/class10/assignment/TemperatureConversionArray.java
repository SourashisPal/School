package in.sourashis.school.class10.assignment;

import java.util.Scanner;

/**
 * Write a program in Java to store 20 temperatures in &#176;F in single dimensional array
 * and display all the temperatures after converting them into &#176;C.
 * @author Sourashis Pal
 */
public class TemperatureConversionArray {

	/**
	 * main() method
	 * @param args Command-line arguments
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[20];
		System.out.print("Enter 20 temperatures in \u00b0F: ");
		for (int i = 0; i < 20; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.print("Temperatures in \u00b0C: ");
		for (int i = 0; i < 20; i++) {
			System.out.print((arr[i]-32) * 5/9 + " ");
		}
	}
}
