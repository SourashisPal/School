package in.sourashis.school.class9.help;

import java.util.Scanner;

/**
 * An air-conditioned bus charges fare from the passengers based on the distance travelled as per the tariff given below:<br>
 * <br>
 * <table>
 *     <caption>Bus Fare Tariff</caption>
 *     <tr>
 *         <th>Distance Travelled</th>
 *         <th>Fare</th>
 *     </tr>
 *     <tr>
 *         <td>Up to 10 km</td>
 *         <td>Fixed charge Rs. 80</td>
 *     </tr>
 *     <tr>
 *         <td>11 km to 20 km</td>
 *         <td>Rs. 6 / km</td>
 *     </tr>
 *     <tr>
 *         <td>21 km to 30 km</td>
 *         <td>Rs. 5 / km</td>
 *     </tr>
 *     <tr>
 *         <td>31 km and above</td>
 *         <td>Rs. 4 / km</td>
 *     </tr>
 * </table>
 * @author Sourashis Pal
 */
public class BusFare {

	/**
	 * main() method
	 * @param args Command-line arguments
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the distance travelled by the passenger (in km): ");
		int distance = sc.nextInt();
		sc.close();

		int fare;
		if (distance <= 10) {
			fare = 80;
		} else if (distance <= 20) {
			fare = 80 + (distance - 10) * 6;
		} else if (distance <= 30) {
			fare = 80 + 10*6 + (distance - 20) * 5;
		} else {
			fare = 80 + 10*6 + 10*5 + (distance - 30) * 4;
		}
		System.out.println("Fare to be paid = Rs. " + fare);
	}
}
