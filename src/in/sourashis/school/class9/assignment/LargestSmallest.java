package in.sourashis.school.class9.assignment;

import java.util.Scanner;

/**
 * Write a program to input three integers and print the largest and the smallest number using Math.max() and Math.min() function.
 * @author Sourashis Pal
 */
public class LargestSmallest {

    /**
     * main method
     * @param args Command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        sc.close();

        System.out.println("Largest = " + Math.max(a, Math.max(b, c)));
        System.out.println("Smallest = " + Math.min(a, Math.min(b, c)));
    }
}
