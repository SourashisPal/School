package in.sourashis.school.class9.help;

import java.util.Scanner;

/**
 * Take no. of days and convert into years, months and days
 * @author Sourashis Pal
 */
public class TimeConversion {

	/**
	 * main() method
	 * @param args Command-line arguments
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the no. of days: ");
		int totaldays = sc.nextInt();
		sc.close();

		int years = totaldays / 365;
		int months = totaldays % 365 / 30;
		int days = totaldays % 365 % 30;
		System.out.println(years + " years, " + months + " months, " + days + " days");
	}
}
