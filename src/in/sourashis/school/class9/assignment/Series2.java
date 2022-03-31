package in.sourashis.school.class9.assignment;

import java.util.Scanner;

/**
 * Print the sum of the following series:-<br>
 * <code>3/4 - 5/6 + 7/8 - 9/11 ... ± n/(n+1)</code>
 * @author Sourashis Pal
 */
public class Series2 {
    /**
     * main() method
     * @param args Command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        sc.close();

        double sum = 0;
        for (int i = 3, s = 1; i <= n; i += 2, s = -s) sum += (double) i/(i+1) * s;
        System.out.println("Sum of series = " + sum);
    }
}
