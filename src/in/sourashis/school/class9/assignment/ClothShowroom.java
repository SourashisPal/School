package in.sourashis.school.class9.assignment;

import java.util.Scanner;

/**
 * A Cloth Showroom has announced the following festival discounts on rhe purchase of items, based on the total cost of the items purchased:<br>
 * <br>
 * <table>
 *     <caption>Cost and Discount</caption>
 *     <tr>
 *         <th>Total Cost</th>
 *         <th>Discount (in Percentage)</th>
 *     </tr>
 *     <tr>
 *         <td>Less than Rs. 2000</td>
 *         <td>5 %</td>
 *     </tr>
 *     <tr>
 *         <td>Rs. 2000 to Rs. 5000</td>
 *         <td>25 %</td>
 *     </tr>
 *     <tr>
 *         <td>Rs. 5001 to Rs. 10000</td>
 *         <td>35 %</td>
 *     </tr>
 *     <tr>
 *         <td>Above Rs. 100000</td>
 *         <td>50 %</td>
 *     </tr>
 * </table>
 * <br>
 * Write a program to input the total cost and compute and display the amount to be paid by the customer after availing the discount
 */
public class ClothShowroom {

	/**
     * main method
     * @param args Command line arguments
     */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter total cost: ");
		double cost = sc.nextDouble();
		sc.close();

		double discount;
		if (cost <= 2000) {
			discount = 5;
		} else if (cost <= 5000) {
			discount = 25;
		} else if (cost <= 10000) {
			discount = 35;
		} else {
			discount = 50;
		}

		double netAmount = cost * (1 - discount/100);
		System.out.printf("Amount to be paid = %.2f\n", netAmount);
	}
}
