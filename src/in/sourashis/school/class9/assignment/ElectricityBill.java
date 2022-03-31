package in.sourashis.school.class9.assignment;

import java.util.Scanner;

/**
 * An electricity company charges their customers according to the units consumed per month according to the given traffic:<br>
 * <br>
 * <table>
 *     <caption>Units and Charges</caption>
 *     <tr>
 *         <th>Units consumed</th>
 *         <th>Charges</th>
 *     </tr>
 *     <tr>
 *         <td>Up to 100 units</td>
 *         <td>Rs. 2 per unit</td>
 *     </tr>
 *     <tr>
 *         <td>More than 100 units and up to 200 units</td>
 *         <td>Rs. 1.80 per unit</td>
 *     </tr>
 *     <tr>
 *         <td>More than 200 units</td>
 *         <td>Rs. 2.50 per unit</td>
 *     </tr>
 * </table>
 * <br>
 * In addition to the above, every customer has to pay Rs. 200 as Service Charge per month.<br>
 * Write a program to input the amount of units consumed and calculate the total charges payable  by the customer
 *
 * @author Sourashis Pal
 */
public class ElectricityBill {

	/**
     * main method
     * @param args Command line arguments
     */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the amount of units consumed: ");
		int units = sc.nextInt();
		sc.close();

		double netAmount;
		if (units <= 100) {
			netAmount = units*2 + 200;
		} else if (units <= 200) {
			netAmount = 100*2 + (units-100)*1.8 + 200;
		} else {
			netAmount = 100*2 + 100*1.8 + (units-200)*1.5 + 200;
		}

		System.out.printf("Total charges payable = %.2f\n", netAmount);
	}
}
