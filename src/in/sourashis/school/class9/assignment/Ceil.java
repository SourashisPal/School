package in.sourashis.school.class9.assignment;

import java.util.Scanner;

/**
 * Write a program to input a positive real number and display its Math.ceil() value<br>
 * Note that the function Math.ceil() should not be used
 * @author Sourashis Pal
 */
public class Ceil {

    /**
     * main method
     * @param args Command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a real positive number: ");
        double n = Math.abs(sc.nextDouble());
        sc.close();

        double floor = Math.floor(n);
        System.out.println("Ceil value = " + (floor == n? floor: floor+1));
    }
}
