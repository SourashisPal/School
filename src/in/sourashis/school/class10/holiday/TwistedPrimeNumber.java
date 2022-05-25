package in.sourashis.school.class10.holiday;

import java.util.Scanner;

/**
 * Write a program to accept a number and check whether the number is Twisted Prime or not.
 * A prime number is said to be Twisted Prime, if the new number obtained after reversing the digits is also a prime number.
 * @author Sourashis Pal
 */
public class TwistedPrimeNumber {

	/**
	 * Checks whether a given number is prime or not
	 * @param n Number to be checked
	 * @return true if the number is prime, false otherwise
	 */
	private static boolean isPrime(int n) {
		if (n <= 1) return false;
		for (int i = 2; i <= n/2; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

	/**
	 * main() method
	 * @param args Command-line arguments
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number: ");
		int n = sc.nextInt();
		sc.close();

		int reverse = 0, copy = n;
		for (; n != 0; n /= 10) {
			reverse = reverse * 10 + n % 10;
		}
		System.out.println(isPrime(copy) && isPrime(reverse)? copy + " is a twisted prime number" : copy + " is not a twisted prime number");
	}
}
