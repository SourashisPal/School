package in.sourashis.school.class9.assignment;

import java.util.Scanner;

/**
 * Write a program to accept three sides of a triangle as parameter and check whether it can form a triangle or not<br>.
 * If it forms a triangle, check whether it is an acute-angled, obtuse-angled or right-angled triangle.<br>
 * <br>
 * Hint: To form a triangle, each side should be less the sum of the other two sides.
 * <br>
 * To form an acute-angled triangle the square of every side should be less than the sum of the squares of the other two sides.<br>
 * To form an obtuse-angled triangle the square of any side should be greater than the sum of the squares of the other two sides.<br>
 * To form a right-angled triangle the square of any side should be equal to the sum of the squares of the other two sides.
 *
 * @author Sourashis Pal
 */
public class TriangleCheckBySide {

	/**
    * main method
    * @param args Command line arguments
    */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter three sides of a triangle: ");
		double a = sc.nextDouble(), b = sc.nextDouble(), c = sc.nextDouble();
		sc.close();

		if (a < (b+c) && b < (a+c) && c < (b+a)) {
			System.out.print("The sides can form a triangle -> ");
			if (a*a < (b*b + c*c) && b*b < (a*a + c*c) && c*c < (b*b + a*a)) {
				System.out.println("Acute-angled triangle");
			} else if (a*a == (b*b + c*c) || b*b == (a*a + c*c) || c*c == (b*b + a*a)) {
				System.out.println("Right-angled triangle");
			} else {
				System.out.println("Obtuse-angled triangle");
			}
		}
	}
}
