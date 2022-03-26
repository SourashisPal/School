package in.sourashis.school.class9;

import java.util.Scanner;

/**
 * Write a program to input principal, rate of interest and time and calculate simple interest<br>
 * Simple Interest = <code>(p*r*t)/100</code>
 * @author Sourashis Pal
 */
public class SimpleInterest {

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

        double simpleInterest = principal * rate * time;
        System.out.printf("Simple Interest = %.2f\n", simpleInterest);
    }
}
