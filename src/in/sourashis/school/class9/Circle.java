package in.sourashis.school.class9;

import java.util.Scanner;

/**
 * Write a program to input radius of a circle and calculate its area and perimeter
 * @author Sourashis Pal
 */
public class Circle {

    /**
     * main method
     * @param args Command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius of circle: ");
        double radius = sc.nextDouble();
        sc.close();

        double area = Math.PI * radius * radius;
        double perimeter = 2 * Math.PI * radius;
        System.out.println("Area of circle = " + area);
        System.out.println("Perimeter of circle = " + perimeter);
    }
}
