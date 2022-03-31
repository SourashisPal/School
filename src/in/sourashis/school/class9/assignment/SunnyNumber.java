package in.sourashis.school.class9.assignment;

import java.util.Scanner;

/**
 * Write a program to input a number and using ternary operator check whether it is a Sunny Number or not<br>
 * A number <code>n</code> is said to be a Sunny Number if <code>√(n+1)</code> is an integer
 * @author Sourashis Pal
 */
public class SunnyNumber {

    /**
    * main method
    * @param args Command line arguments
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        sc.close();

        System.out.println(Math.sqrt(n + 1) % 1 == 0? "Sunny number": "Not sunny number");
    }
}
