package in.sourashis.school.class9.assignment;

import java.util.Scanner;

/**
 * Using switch write a menu-driven program to convert a given temperature from Fahrenheit to Celsius and vice versa.
 * For an incorrect choice, an appropriate error message should be displayed.
 * @author Sourashis Pal
 */
public class TemperatureConversion {

	/**
    * main method
    * @param args Command line arguments
    */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("1. Fahrenheit to Celsius\n" +
				"2. Celsius to Fahrenheit\n" +
				"Enter choice: ");
		int choice = sc.nextInt();

		double fahrenheit, celsius;
		switch (choice) {
			case 1:
				System.out.print("\nEnter temperature in Fahrenheit: ");
				fahrenheit = sc.nextDouble();
				celsius = (fahrenheit-32) * 5.0/9;
				System.out.println("Temperature in Celsius = " + celsius);
				break;
			case 2:
				System.out.print("\nEnter temperature in Celsius: ");
				celsius = sc.nextFloat();
				fahrenheit = celsius * 9.0/5 + 32;
				System.out.println("Temperature in Fahrenheit = " + fahrenheit);
				break;
			default:
				System.out.println("\nWrong choice!!");
		}

		sc.close();
	}
}
