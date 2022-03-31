package in.sourashis.school.class9.assignment;

import java.util.Scanner;

/**
 * Enter a number and print factors of the number
 * @author Sourashis Pal
 */
public class Factors {

    /**
     * main() method
     * @param args Command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = Math.abs(sc.nextInt());
        sc.close();

        System.out.println("\nFactors of " + n + " are:-");
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i);
            }
        }
    }
}
