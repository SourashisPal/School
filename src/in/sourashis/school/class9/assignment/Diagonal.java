package in.sourashis.school.class9.assignment;

import java.util.Scanner;

/**
 * Write a program to input the length and breadth of a rectangle and find its diagonal.<br>
 * Diagonal = <code>&#8730;(length<sup>2</sup> + breadth<sup>2</sup>)</code>
 * @author Sourashis Pal
 */
public class Diagonal {

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
        sc.close();

        double diagonal = Math.sqrt(length*length + breadth*breadth);
        System.out.println("Diagonal = " + diagonal);
    }
}
