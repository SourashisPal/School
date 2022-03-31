package in.sourashis.school.class9.assignment;

import java.util.Scanner;

/**
 * Write a program to print the fibonacci series up to n terms:-
 * 0 1 1 2 3 5 8 13 21 34 ... n terms
 * @author Sourashis Pal
 */
public class Fibonacci {

    /**
     * main() method
     * @param args Command-line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of terms: ");
        int n = sc.nextInt();
        sc.close();

        if (n >= 1) System.out.println(0);
        if (n >= 2) System.out.println(1);
        for (int i = 3, a = 0, b = 1, c; i <= n; i++, a = b, b = c) {
            System.out.println(c = a+b);
        }
    }
}