package in.sourashis.school.class9.assignment;

import java.util.Scanner;

/**
 * Write a program to input an integer and check whether it is greater than 100 or less than 100 or equal to 100
 * @author Sourashis Pal
 */
public class CheckNumber {

	/**
    * main method
    * @param args Command line arguments
    */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = sc.nextInt();
		sc.close();

		if (n > 100) {
			System.out.println("Greater than 100");
		} else if (n < 100){
			System.out.println("Lesser than 100");
		} else {
			System.out.println("Equal to 100");
		}
	}
}
