package in.sourashis.school.class9;

import java.util.Scanner;

/**
 * Write a program to input three angles of a triangle and check whether a triangle is possible or not<br>
 * If possible then check whether it is an acute-angled triangle, right-angled or an obtuse-angled triangle<br>
 * Otherwise, display "Triangle not possible".<br>
 * <br>
 * Sample Input:<br>
 * Enter three angles:-<br>
 * 40<br>
 * 50<br>
 * 90<br>
 * <br>
 * Sample Output:<br>
 * Right-angled triangle<br>
 * <br>
 * @author Sourashis Pal
 */
public class TriangleCheckByAngle {

	/**
    * main method
    * @param args Command line arguments
    */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter three angles: ");
		int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
		sc.close();

		if (a+b+c == 180 && a>0 && b>0 && c>0) {
			if (a < 90 && b < 90 && c < 90) {
				System.out.println("Acute-angled triangle");
			} else if (a == 90 || b == 90 || c == 90) {
				System.out.println("Right-angled triangle");
			} else {
				System.out.println("Obtuse-angled triangle");
			}
		} else {
			System.out.println("Triangle not possible");
		}
	}
}
