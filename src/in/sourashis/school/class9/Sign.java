package in.sourashis.school.class9;

import java.util.Scanner;

/**
 * Write a program to input a number and display 1, if it is positive and – 1, if it is negative<br>
 * Note: Math.abs() and no conditional statement should be used
 * @author Sourashis Pal
 */
public class Sign {

    /**
    * main method
    * @param args Command line arguments
    */
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        System.out.println(n / Math.abs(n));
    }
}
