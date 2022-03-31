package in.sourashis.school.class9.exam.term2;

import java.util.Scanner;

/**
 * A company has employees, who are divided into four grades depending on their Basic pay per month as follows,<br>
 * <br>
 * <table>
 *     <tr>
 *         <th>Basic (Rs./month)</th>
 *         <th>Grade</th>
 *         <th>DA</th>
 *         <th>HRA</th>
 *     </tr>
 *     <tr>
 *         <td>10,001 or more</td>
 *         <td>1</td>
 *         <td>40%</td>
 *         <td>30%</td>
 *     </tr>
 *     <tr>
 *         <td>5,001 to 10,000</td>
 *         <td>2</td>
 *         <td>40%</td>
 *         <td>25%</td>
 *     </tr>
 *     <tr>
 *         <td>2001 to 5,000</td>
 *         <td>3</td>
 *         <td>30%</td>
 *         <td>20%</td>
 *     </tr>
 *     <tr>
 *         <td>2,000 or less</td>
 *         <td>4</td>
 *         <td>30%</td>
 *         <td>15%</td>
 *     </tr>
 * </table>
 * <br>
 * If the Net salary which is the total of Basic, DA, and HRA, is above Rs. 50,000 per month
 * then Income Tax at the rate of 309% of the annual salary exceeding 50,000 is deducted on monthly basis.
 * Taking name of the employee and teh Basic (monthly) pay as inputs, prepare & print a payslip,
 * which contains Name, Grade, Basic monthly pay, DA, HRA, Monthly Income Tax and Net Monthly Salary, for employee
 * <br>
 * @author Sourashis Pal
 */
public class Salary {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter name of the employee: ");
		String name = sc.nextLine();
		System.out.print("Enter basic pay: ");
		double basic = sc.nextDouble();
		sc.close();

		int grade, da, hra;
		if (basic > 10000) {
			grade = 1;
			da = 40;
			hra = 30;
		} else if (basic > 5000) {
			grade = 2;
			da = 40;
			hra = 25;
		} else if (basic > 2000) {
			grade = 3;
			da = 30;
			hra = 20;
		} else {
			grade = 4;
			da = 30;
			hra = 15;
		}

		double daAmount = da / 100.0 * basic;
		double hraAmount = hra / 100.0 * basic;
		double net = basic + daAmount + hraAmount;
		double incomeTax = 0;
		if (net > 50000) {
			incomeTax = 0.3 * net;
		}

		System.out.println("Name               = " + name);
		System.out.println("Grade              = " + grade);
		System.out.println("Basic monthly pay  = " + basic);
		System.out.println("DA                 = " + daAmount);
		System.out.println("HRA                = " + hraAmount);
		System.out.println("Monthly Income Tax = " + incomeTax);
		System.out.println("Net monthly salary = " + net);
	}
}