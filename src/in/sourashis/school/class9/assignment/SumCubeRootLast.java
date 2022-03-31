package in.sourashis.school.class9.assignment;

import java.util.Scanner;

/**
 * Write a program to input three integers and find the sum of the cube roots of their last digits
 * @author Sourashis Pal
 */
public class SumCubeRootLast {

    /**
    * main method
    * @param args Command line arguments
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three integers: ");
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        sc.close();

        double sum = Math.cbrt(a%10) + Math.cbrt(b%10) + Math.cbrt(c%10);
        System.out.println("Sum of cube roots of last digits = " + sum);
    }
}
