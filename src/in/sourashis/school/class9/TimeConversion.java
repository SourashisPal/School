package in.sourashis.school.class9;

import java.util.Scanner;

/**
 * Write a program to input time in seconds and display the time broken up into hours, minutes and seconds
 * @author Sourashis Pal
 */
public class TimeConversion {

    /**
    * main method
    * @param args Command line arguments
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter time in seconds: ");
        int seconds = sc.nextInt();
        sc.close();

        int minutes = seconds / 60;
        int hours = minutes / 60;
        System.out.println("Time in hours = " + hours);
        System.out.println("Time in minutes = " + minutes%60);
        System.out.println("Time in seconds = " + seconds%60);
    }
}
