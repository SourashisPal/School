package in.sourashis.school.class9.assignment;

import java.util.Scanner;

/**
 * Write a program to input the radius and height of a cylinder and find its volume and total surface area
 * @author Sourashis Pal
 */
public class Cylinder {

    /**
     * main method
     * @param args Command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius: ");
        double radius = sc.nextDouble();
        System.out.print("Enter height: ");
        double height = sc.nextDouble();
        sc.close();

        double volume = Math.PI * radius * radius * height;
        double totalSurfaceArea = Math.PI * radius * (height + radius);
        System.out.println("Volume = " + volume);
        System.out.println("Total surface area = " + totalSurfaceArea);
    }
}
