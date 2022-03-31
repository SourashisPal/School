package in.sourashis.school.class9.help;

import java.util.Scanner;

/**
 * Write a program to create a function which calculates the volume of a sphere.
 * @author Sourashis Pal
 */
public class SphereVolume {

	/**
	 * Calculates the volume of a sphere.
	 * @param radius Radius of the sphere
	 * @return Volume of the sphere
	 */
	private static double volume(double radius) {
		return 4.0/3 * Math.PI * Math.pow(radius, 3);
	}

	/**
	 * main() method
	 * @param args Command-line arguments
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter radius: ");
		double radius = sc.nextDouble();
		sc.close();
		System.out.println("Volume = " + volume(radius));
	}
}
