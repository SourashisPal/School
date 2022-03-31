package in.sourashis.school.class9.assignment;

import java.util.Scanner;

/**
 * Enter a number and check whether it is palindrome or not.<br>
 * E.g. 121
 * @author Sourashis Pal
 */
public class PalindromeNumber {

	/**
	 * main() method
	 * @param args Command-line arguments
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = sc.nextInt();
		sc.close();

		int copy = n, reverse = 0;
		while (n != 0) {
			reverse = reverse*10 + n%10;
			n /= 10;
		}
		System.out.println(copy == reverse? "Palindrome number": "Not palindrome number");
	}
}
