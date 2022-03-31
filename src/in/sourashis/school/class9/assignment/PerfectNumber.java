package in.sourashis.school.class9.assignment;

import java.util.Scanner;

/**
 * Enter a number, calculate the summation of the factors including 1 and excluding the number and check whether the summation is equal to the number.
 * If yes, print "Perfect Number" else print "Not Perfect Number"
 * @author Sourashis Pal
 */
public class PerfectNumber {

    /**
     * main() method
     * @param args Command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = Math.abs(sc.nextInt());
        sc.close();
        
        int sum = 0;
        for (int i = 1; i <= n/2; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        System.out.println(n == sum? "Perfect Number": "Not Perfect Number");
    }
}