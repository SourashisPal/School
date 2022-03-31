package in.sourashis.school.class9.assignment;

import java.util.Scanner;

/**
 * Enter a number and print factorial of the number
 * @author Sourashis Pal
 */
public class Factorial {

    /**
     * main() method
     * @param args Command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        sc.close();
        
        long fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        System.out.println("Factorial = "+fact);
    }
}