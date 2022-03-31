package in.sourashis.school.class9.assignment;

import java.util.Scanner;

/**
 * Print the sum of the following series:-
 * 3 - 6 + 9 - 12 ... ± n
 * @author Sourashis Pal
 */
public class Series1 {
    /**
     * main method
     * @param args Command line arguments
     */
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter n: ");
       int n = sc.nextInt();
       sc.close();

       int sum = 0;
       for (int i = 3, s = 1; i <= n; i += 3, s = -s) sum += i*s;
        System.out.println("Sum of the series = " + sum);
    }
}
