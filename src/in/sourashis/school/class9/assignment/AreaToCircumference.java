package in.sourashis.school.class9.assignment;

import java.util.Scanner;

/**
 * Write a program to input the area of a circle and find its circumference.
 * @author Sourashis Pal
 */
public class AreaToCircumference {

    /**
    * main method
    * @param args Command line arguments
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter area of circle: ");
        double area = sc.nextDouble();
        sc.close();

        double radius = Math.sqrt(area / Math.PI);
        double circumference = 2 * Math.PI * radius;
        System.out.println("Circumference of circle = " + circumference);
    }
}
