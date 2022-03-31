package in.sourashis.school.class9.assignment;

import java.util.Scanner;

/**
 * Write a program to input the area of a square and find its perimeter.
 * @author Sourashis Pal
 */
public class Square {

    /**
    * main method
    * @param args Command line arguments
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter area: ");
        double area = sc.nextDouble();
        sc.close();

        double perimeter = 4 * Math.sqrt(area);
        System.out.println("Perimeter = " + perimeter);
    }
}
