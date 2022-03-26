package in.sourashis.school.class9;

import java.util.Scanner;

/**
 * A library charges a fine for books returned late
 * Following are the fines:<br>
 * <br>
 * <table>
 *     <caption>Fines</caption>
 *     <tr>
 *         <td>First five days : </td>
 *         <td>40 paise per day.</td>
 *     </tr
 *     ><tr>
 *         <td>Six to ten days : </td>
 *         <td>65 paise per day.</td>
 *     </tr>
 *     <tr>
 *         <td>Above ten days : </td>
 *         <td>80 paise per day.</td>
 *     </tr>
 * </table>
 * <br>
 * Design a program to calculate the fine assuming that a book is returned N days later
 *
 * @author Sourashis Pal
 */
public class LibraryFine {

	/**
     * main method
     * @param args Command line arguments
     */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the no. of days after which the book has been returned: ");
		int n = sc.nextInt();
		sc.close();

		double fine;
		if (n <= 5) {
			fine = 0.4*n;
		} else if (n <= 10) {
			fine = 0.4*5 + 0.65*(n-5);
		} else {
			fine = 0.4*5 + 0.65*5 + 0.8*(n-10);
		}

		System.out.printf("Fine = %.2f\n", fine);
	}
}
