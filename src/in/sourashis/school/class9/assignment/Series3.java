package in.sourashis.school.class9.assignment;

import java.util.Scanner;

/**
 * Print the sum of the following series:-
 * 1/2 - 2/6 + 3/9 - 4/12 ... ± n/(n*3)
 * @author Sourashis Pal
 */
public class Series3 {
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
        for (int i = 1, s = 1; i <= n; i++, s = -s) sum += (double) i/(i*3) * s;
        System.out.println("Sum of the series = " + sum);
    }
}
