package in.sourashis.school.class9.assignment;

import java.util.Scanner;

/**
 * Print multiplication table of an entered number.
 * @author Sourashis Pal
 */
public class MultiplicationTable {
    /**
     * main method
     * @param args Command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        sc.close();

        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " * " + i + " = " + n*i);
        }
    }
}
