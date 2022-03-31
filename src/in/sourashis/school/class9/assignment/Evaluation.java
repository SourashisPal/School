package in.sourashis.school.class9.assignment;

import java.util.Scanner;

/**
 * Write a program that outputs the results of the following evaluations based on the number entered by the user:<br>
 * i.   Cube root of the number <br>
 * ii.  Absolute value of the number<br>
 * iii. Square root of the number <br>
 * iv.  Random numbers between 0 and 1
 *
 * @author Sourashis Pal
 */
public class Evaluation {

    /**
     * main method
     * @param args Command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double n = sc.nextDouble();
        sc.close();

        System.out.println("Cube root = " + Math.cbrt(n));
        System.out.println("Absolute value = " + Math.abs(n));
        System.out.println("Square root = " + Math.sqrt(n));
        System.out.println("Random number between 0 and 1 = " + Math.random());
    }
}
