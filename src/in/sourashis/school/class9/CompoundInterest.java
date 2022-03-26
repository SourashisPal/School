package in.sourashis.school.class9;

import java.util.Scanner;

/**
 * Write a program to input the principal, rate of interest and time and find the compound interest<br>
 * Compound Interest = <code>p((1+r)/100)<sup>t</sup> - p</code>
 */
public class CompoundInterest {

    /**
     * main method
     * @param args Command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter principal: ");
        double principal = sc.nextDouble();
        System.out.print("Enter rate of interest: ");
        double rate = sc.nextDouble();
        System.out.print("Enter time: ");
        double time = sc.nextDouble();
        sc.close();

        double compoundInterest = principal * Math.pow(1 + rate/100, time);
        System.out.printf("Compound Interest = %.2f\n", compoundInterest);
    }
}
