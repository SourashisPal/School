package in.sourashis.school.class9.exam.term2;

import java.util.Scanner;

/**
 * Write a program to print the sum of the following series:-<br>
 * S = a/(a+1!) + a^2/(a+3!) + a^3/(a+5!) + a^4(a+7!) + ... &lt;10 terms&gt;
 * @author Sourashis Pal
 */
public class Series {

	/**
	 * mai() method
	 * @param args Command-line arguments
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of a: ");
		double a = sc.nextDouble();
		sc.close();

		double sum = 0, fact = 1;
		for (int i = 1; i <= 10; i++) {
			sum += Math.pow(a, i) / (a + fact);
			fact *= (i*2) * (i*2+1);
		}
		System.out.println("Sum of the series = " + sum);
	}
}