package in.sourashis.school.class9.help;

import java.util.Scanner;

/**
 * Write a program to calculate the hypotenuse of a right-angled triangle using the method <code>pythagoras()</code>.
 * @author Sourashis Pal
 */
public class Hypotenuse {

	/**
	 * Calculates the hypotenuse of a right-angled triangle.
	 * @param base Base of the triangle
	 * @param height Height of the triangle
	 * @return Hypotenuse of the triangle
	 */
	private static double hypotenuse(double base, double height) {
		return Math.sqrt(base * base + height * height);
	}

	/**
	 * main() method
	 * @param args Command-line arguments
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter base: ");
		double base = sc.nextDouble();
		System.out.print("Enter height: ");
		double height = sc.nextDouble();
		sc.close();

		System.out.println("Hypotenuse = " + hypotenuse(base, height));
	}
}
