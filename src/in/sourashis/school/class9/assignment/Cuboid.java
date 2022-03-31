package in.sourashis.school.class9.assignment;

import java.util.Scanner;

/**
 * Write a program to input, length, breadth and height of a cuboid and find its volume and surface area
 * @author Sourashis Pal
 */
public class Cuboid {

    /**
     * main method
     * @param args Command line arguments
      */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length: ");
        double length = sc.nextDouble();
        System.out.print("Enter breadth: ");
        double breadth = sc.nextDouble();
        System.out.print("Enter height: ");
        double height = sc.nextDouble();
        sc.close();

        double volume = length * breadth * height;
        double surfaceArea = 2 * (length*breadth + breadth*height + height*length);
        System.out.println("Volume = " + volume);
        System.out.println("Surface area = " + surfaceArea);
    }
}
