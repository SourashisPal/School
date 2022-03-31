package in.sourashis.school.class9.assignment;

import java.util.Scanner;

/**
 * Enter a single digit number and print and count multiples of that number between 1 and 1000.
 * @author Sourashis Pal
 */
public class MultiplesCount {

    /**
     * main() method
     * @param args Command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a single-digit number: ");
        int n = Math.abs(sc.nextInt());
        sc.close();

        if (n >= 10) {
            System.out.println("Not a single-digit number");
            return;
        }

        System.out.println("\nMultiples from 1 to 1000:-");
        int count = 0;
        for (int i = 1; i <= 1000; i++) {
            if (i % n == 0) {
                System.out.println(i);
                count++;
            }
        }
        System.out.println("Count of multiples = " + count);
    }
}
