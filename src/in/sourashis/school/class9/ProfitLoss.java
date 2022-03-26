package in.sourashis.school.class9;

import java.util.Scanner;

/**
 * Write a program to input the Selling Price and Cost Price of a commodity
 * and find the Profit or Loss made upon selling the product.
 * @author Sourashis Pal
 */
public class ProfitLoss {

	/**
    * main method
    * @param args Command line arguments
    */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter selling price of the commodity: ");
		double sp = sc.nextDouble();
		System.out.print("Enter cost price of the commodity: 	");
		double cp = sc.nextDouble();
		sc.close();

		if (sp > cp) {
			System.out.printf("Profit = %.2f\n", sp-cp);
		} else if (cp > sp){
			System.out.printf("Loss = %.2f\n", cp-sp);
		} else {
			System.out.println("Neither profit nor loss");
		}
	}
}
